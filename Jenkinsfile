pipeline {

    agent any

    tools {
        maven "maven"
    }

    environment {
        APP_NAME     = "spring-docker-cicd"
        RELEASE_NO   = "1.0.0"
        DOCKER_USER  = "nareshvanka"
    }

    stages {

        stage("SCM Checkout") {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/NareshVanka21/jenkins-ci-cd.git']]
                )
            }
        }

        stage("Build Process") {
            steps {
                bat "mvn clean install"
            }
        }

        stage("Prepare Image Metadata") {
            steps {
                script {
                    env.IMAGE_NAME = "${env.DOCKER_USER}/${env.APP_NAME}"
                    env.IMAGE_TAG  = "${env.RELEASE_NO}-${env.BUILD_NUMBER}"
                }
            }
        }

        stage("Build Image") {
            steps {
                bat "docker build -t ${env.IMAGE_NAME}:${env.IMAGE_TAG} ."
            }
        }

        stage("Deploy Image to Hub") {
            steps {
                withCredentials([
                    usernamePassword(
                        credentialsId: 'db-creds',
                        usernameVariable: 'DOCKER_USER',
                        passwordVariable: 'DOCKER_PASS'
                    )
                ]) {
                    bat """
                        echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin
                        docker push ${env.IMAGE_NAME}:${env.IMAGE_TAG}
                    """
                }
            }
        }
    }

    post {
        always {
            emailext(
                attachLog: true,
                mimeType: 'text/html',
                subject: "Pipeline Status : ${env.BUILD_NUMBER}",
                to: 'vanka.nari@gmail.com',
                body: """
                <html>
                    <body>
                        <p>Build Status: ${currentBuild.currentResult}</p>
                        <p>Build Number: ${env.BUILD_NUMBER}</p>
                        <p>Check the <a href="${env.BUILD_URL}">console output</a>.</p>
                    </body>
                </html>
                """
            )
        }
    }
}

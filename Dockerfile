FROM eclipse-temurin:21-jdk-alpine
workDIR /app
COPY  target/*.jar userapp.jar
expose 9191
ENTRYPOINT ["java","-jar","userapp.jar"]
CMD ["java","-jar","userapp.jar"]
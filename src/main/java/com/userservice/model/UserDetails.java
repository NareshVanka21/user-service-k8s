package com.userservice.model;

public class UserDetails {

    private int id;
    private String name;
    private String desc;

    public UserDetails(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public UserDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

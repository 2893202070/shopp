package com.moyu.shopp.domain;

public class Employee {
    private String name;
    private String password;

    public Employee() {
    }

    public Employee(String name, String passworld) {
        this.name = name;
        this.password = passworld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passworld) {
        this.password = passworld;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", passworld='" + password + '\'' +
                '}';
    }
}

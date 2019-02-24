package com.moyu.shopp.domain;

public class Employee {
    private String name;
    private String passworld;

    public Employee() {
    }

    public Employee(String name, String passworld) {
        this.name = name;
        this.passworld = passworld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", passworld='" + passworld + '\'' +
                '}';
    }
}

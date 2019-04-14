package com.university;

public class Professor {
    private Department department;
    private String name;

    public Professor(Department department, String name) {
        this.department = department;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.university;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Student {
    private String name;
    private String Id;
    private String major;
    private Department department;
    private ArrayList <Course> courses ;

    public Student(String id, String software_eng, com.university.Department department) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String name, String ID, String major, Department department) {
        setDepartment(department);
        setId(ID);
        setMajor(major);
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.Id;
    }

    public String getMajor() {
        return this.major;
    }

    public Department getDepartment() {
        return this.department;
    }

    public Course[] getCourses() {
        Course[] temp = new Course[0];

        if (courses != null) courses.toArray(temp);
        return temp;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
}

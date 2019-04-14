package com.university;

import java.util.ArrayList;

public class Department {
    private String name;

    private ArrayList<Student> array;
    private ArrayList<Course> arr;
    private ArrayList<Professor> a;
    private String major;

    public void setMajor(String major) {
        this.major = major;
    }

    public Department(String name , String major) {
        setMajor(major);
        this.name = name;
        this.array = new ArrayList<>();
        this.arr = new ArrayList<>();
        this.a = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        if (student.getMajor() == "physics")
            this.array.add(student);
    }

    public Student[] getStudents(){
        Student [] temp = new Student[array.size()];
        for (int i = 0 ; i < array.size() ; i++) temp[i] = array.get(i);
        return temp;
    }

    public void removeStudent(Student student){
        if (student.getMajor() == "physics") this.array.remove(student);
    }

    public void addCourse(Course course){
        if (course.getDepartment() == this)
            this.arr.add(course);
    }

    public Course[] getCourses(){
        Course[] tmp = new Course[arr.size()];
        if (arr != null)for (int i = 0 ; i < arr.size() ; i++) tmp[i] = arr.get(i);
        return tmp;    }

    public void removeCourse(Course course){
        if (course.getDepartment() == this)
            this.arr.remove(course);
    }

    public void addProfessor(Professor professor){
        if (professor.getDepartment() == this) this.a.add(professor);
    }

    public Professor[] getProfessors(){
        Professor[] tmp = new Professor[a.size()];
        for (int i = 0 ; i < arr.size() ; i++) tmp[i] = a.get(i);
        return tmp;
    }

    public void removeProfessor(Professor professor){
        if (professor.getDepartment() == this) this.a.remove(professor);
    }

}
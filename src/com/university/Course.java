package com.university;

import java.security.PrivateKey;
import java.util.ArrayList;

public class Course {
    private String ID;
    private String name;
    private Department department;
    private Professor professor;
    private int credit;
    private ArrayList<Student> students = new ArrayList<>();

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Course(String ID, String name, Department department, Professor professor, int credit) {
        setDepartment(department);
        setName(name);
        setCredit(credit);
        setDepartment(department);
        setID(ID);
        setProfessor(professor);
    }

    public String getID(){
        return ID;
    }

    public Department getDepartment(){
        return department;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        Student [] temp = new Student[students.size()];
        for (int i = 0 ; i < students.size() ; i++) temp[i] = students.get(i);
        return temp;
    }
    //public ArrayList<Student> studentArrayList(){
//        return students;
//}
    public Professor getProfessor() {
        return professor;
    }

    public int getCredit() {
        return credit;
    }

    public void enrollStudent(Student student){
        students.add(student);
    }

}

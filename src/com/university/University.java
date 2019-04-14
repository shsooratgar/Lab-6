package com.university;

import java.util.ArrayList;

public class University {
    private ArrayList<Department> array;
    public University (){
        this.array = new ArrayList<>();
    }
    public Department[] getDepartments(){
        Department[] tmp = new Department[0];
        if (this.array != null)this.array.toArray(tmp);
        return tmp;
    }

    public void addDepartment(Department department){
        this.array.add(department);
    }

    public void removeDepartment(Department department){
        this.array.remove(department);
    }
}
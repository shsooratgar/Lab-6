package test;

import com.university.Course;
import com.university.Department;
import com.university.Professor;
import com.university.Student;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class StudnetTest {
    static Student student;
    static Department department;
    static Course course1 , course2;
    static Professor professor;
    static Department d;
    @BeforeAll
    public static void createStudent(){
        department = new Department("physics" , "com");
        d = new Department("cs" , "math");
        student = new Student("Alireza", "1234", "Software Eng", department);
        professor = new Professor(department , "Fallah");
        course1 = new Course("31" , "CEIT" , department , professor , 1000);
        course2 = new Course("33" , "workshop" , d , professor , 30);
        course1.enrollStudent(student);
    }

    @Test
    public void testStudentGetName(){
        assertEquals("Alireza", student.getName());
    }

    @Test
    public void testStudenGetCourses(){

        assertNotNull(student.getCourses());
        assertEquals(0, student.getCourses().length);
    }
    @Test
    public void CourseTest(){
        assertEquals("31" , course1.getID());
        assertEquals(department , course1.getDepartment());
        assertEquals("CEIT" , course1.getName());
        assertEquals(professor , course1.getProfessor());
        assertEquals(1, course1.getStudents().length);
        for (int i = 0 ; i < course1.getStudents().length ; i++) assertEquals(department , course1.getStudents()[i].getDepartment());

    }
    @Test
    public void DepartmentTest(){
        Department physic = new Department("Physics" , "Physics");
        Student student1 = new Student("amir" , "1" , "gh" , physic);
        Student student2 = new Student("ali" , "2" , "physics" , physic);
        Professor professor1 = new Professor(department , "jafar");
        Professor professor2 = new Professor(d , "dumbeldor");
        department.addStudent(student2);
        department.addStudent(student1);
        assertEquals(1 , department.getStudents().length);
        assertNotNull(department.getStudents());
        department.removeStudent(student1);
        assertEquals(1 , department.getStudents().length);
        department.removeStudent(student2);
        assertEquals(0 , department.getStudents().length);
        assertEquals("physics" , department.getName());
        department.addCourse(course1);
        assertEquals(1 , department.getCourses().length);
        department.addCourse(course2);
        assertEquals(1 , department.getCourses().length);
        assertNotNull(department.getCourses());
        department.removeCourse(course2);
        assertEquals(1 , department.getCourses().length);
        department.removeCourse(course1);
        assertEquals(0 , department.getCourses().length);
        department.addProfessor(professor1);
        assertEquals(1 , department.getProfessors().length);
        department.addProfessor(professor2);
        assertEquals(1 , department.getProfessors().length);
    }
}

package com.vieracode;

import com.vieracode.domain.Student;
import com.vieracode.service.StudentService;
import com.vieracode.service.impl.StudentServiceImpl;

import java.util.List;

public class Main {

    public static void main(String args[]) {
        StudentService service = new StudentServiceImpl();
        List<Student> students = service.getAll();

        students.stream().filter(student -> student.getLevel()>2).map(Student::getName).forEach(System.out::println);


    }
}

package com.vieracode.service.impl;

import com.vieracode.domain.Student;
import com.vieracode.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    public static List<Student> students;

    static {
        students = new ArrayList<>();
        students.add(new Student(13579, "Jose", "Viera", 3));
        students.add(new Student(24680, "Gabriel", "Hernandez", 2));
        students.add(new Student(12457, "David", "Campos", 4));
        students.add(new Student(23568, "Ivett", "Perez", 5));
        students.add(new Student(97531, "Angelica", "Gallard", 1));
        students.add(new Student(97531, "Joseph", "Smith", 6));
        students.add(new Student(97531, "Gimpier", "Lee", 2));
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}

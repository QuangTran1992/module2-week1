package com.student.service;

import com.student.dal.StudentDB;
import com.student.model.Student;

import java.io.IOException;

public class StudentService {
    StudentDB studentDB = new StudentDB();

    public void add(Student st) throws IOException {
        studentDB.add(st);
    }
    public  void delete(int id) throws Exception {
        studentDB.delete(id);
    }
    public void edit(int id) throws IOException {
        studentDB.edit(id);
    }


}

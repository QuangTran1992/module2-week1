package com.codegymStudent.service;

import com.codegymStudent.model.Student;
import com.codegymStudent.studentDB.StudentDB;

import java.io.IOException;
import java.util.Map;

public class StudentService {
    StudentDB studentDB = new StudentDB();
    public void print(){
        for (Map.Entry<Integer , Student> entry: StudentDB.codeGymStudentList.entrySet()
             ) {
            System.out.println(entry.getKey() + "...." + entry.getValue().toStringSv());
        }
    }
    public void addStudent(Student student) throws IOException {
        studentDB.add(student);
        studentDB.saveFile();
    }
    public void delete(int id) throws Exception {
        studentDB.remove(id);
        studentDB.saveFile();
    }
    public Student findStudent(int id){
        return StudentDB.codeGymStudentList.get(id);
    }
    public void updateFile() throws IOException {
        studentDB.saveFile();
    }
}

package com.student.dal;

import com.student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentDB {
    List<Student> studentList = new ArrayList<>();
    Student st = new Student();
    Scanner sc = new Scanner(System.in);

    public void add(Student st) throws IOException {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == st.getId()) {
                System.out.println("id da ton tai");
                return;
            }
        }
        studentList.add(st);
        saveFile();
    }
    public void delete(int id)throws Exception{
        for(int i = 0 ; i< studentList.size();i++){
           if(studentList.get(i).getId() == id){
               studentList.remove(i);
               System.out.println("xoa thanh cong");
               return;
           }
        }
        saveFile();
        System.out.println("ko tim thay");
    }
    public void edit( int id) throws IOException {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                System.out.println("input name");
                String name = sc.nextLine();
                System.out.println("input score1");
                float sc1 = sc.nextFloat();
                System.out.println("input score2");
                float sc2 = sc.nextFloat();
                System.out.println("input score3");
                float sc3 = sc.nextFloat();
                System.out.println("input score4");
                float sc4 = sc.nextFloat();

                studentList.get(i).setName(name);
                studentList.get(i).setScore1(sc1);
                studentList.get(i).setScore2(sc2);
                studentList.get(i).setScore3(sc3);
                studentList.get(i).setScore4(sc4);
            }
        }
        saveFile();
    }
//    public void saveFile() throws IOException {
//        File file = new File("Student.csv");
//        if(!file.exists()){
//            file.createNewFile();
//        }
//        FileOutputStream fileOutputStream = new FileOutputStream("Student.csv");
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//
//        byte[] b ;
//        for ( int i = 0 ; i < studentList.size();i++){
//            b = studentList.get(i).toString().getBytes();
//            bufferedOutputStream.write(b);
//        }
//        bufferedOutputStream.close();
//        fileOutputStream.close();
//    }
//
//    public void readFile() throws IOException {
//        FileReader fileReader = new FileReader("Student.csv");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        String line;
//        while((line = bufferedReader.readLine()) != null){
//            String[] arr = line.split(",");
//            Student student = new Student(arr[0], Integer.parseInt(arr[1]), Float.parseFloat(arr[2]),Float.parseFloat(arr[3]),Float.parseFloat(arr[4]),Float.parseFloat(arr[5]) );
//            studentList.add(student);
//         }
//        bufferedReader.close();
//        fileReader.close();
//    }

    public void display(){
        for(int i = 0 ; i < studentList.size();i++){
            System.out.println(studentList.get(i).toString());
        }
    }
    public void saveFile() throws IOException {
        File file = new File("Student.csv");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream("Student.csv");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        byte[] b ;
        for (int i = 0; i <  studentList.size(); i++) {
            b = studentList.get(i).toString().getBytes();
            bufferedOutputStream.write(b);
        }
        bufferedOutputStream.close();
        fileOutputStream.close();
    }
    public  void readFile() throws IOException {
        FileReader fileReader = new FileReader("Student.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while( (line = bufferedReader.readLine()) != null){
            String[] arr = line.split(",");
            Student student = new Student(arr[0],Integer.parseInt(arr[1]), Float.parseFloat(arr[2]), Float.parseFloat(arr[3]),Float.parseFloat(arr[4]),Float.parseFloat(arr[5])) ;
            add(student);
        }
        bufferedReader.close();
        fileReader.close();
    }

}





package com.student.dat;

import com.student.model.Student;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDT {
    public Map<Integer , Student> studentList = new HashMap<>();
    public int count =0;

    public void add(Student st){
        count++;
//        st.setId(count);
        studentList.put(count,st);
    }
    public void delete(int n){
        if ( studentList.containsKey(n) ){
            studentList.remove(n);
            System.out.println("delete complete");
        }
        else{
            System.out.println("not found");
        }
    }
    public void edit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input n want to edit : ");
        int n = sc.nextInt();
        sc.nextLine();

        if(studentList.containsKey(n)){
            System.out.println("input name");
            String name = sc.nextLine();
            studentList.get(n).setName(name);

            System.out.println("input id");
            int id = sc.nextInt();
            studentList.get(n).setId(id);

            System.out.println("input age");
            int age = sc.nextInt();
            sc.nextLine(); // giua nextInt va nextLine ( phai them vao next line)
            studentList.get(n).setAge(age);

            System.out.println("input gender");
            String gender = sc.nextLine();
            studentList.get(n).setGender(gender);

        }
        else
            System.out.println("not found");
    }
    public void saveFile(){
            File fl = new File("student.csv");
            if(!fl.exists()){
                try {
                    fl.createNewFile();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        try {
            FileOutputStream fos = new FileOutputStream(fl);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            for (Map.Entry<Integer,Student> entry : studentList.entrySet() ){
                bos.write(entry.getValue().toString().getBytes());
                // lay gia tri sau khi duyet hashMap  chuyen sang file CSV  theo byte
            }
            bos.flush();
            bos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void display(){
        for ( Map.Entry<Integer , Student> entry: studentList.entrySet()
             ) {
            System.out.print(entry.getKey()+","+entry.getValue());

        }
    }
}

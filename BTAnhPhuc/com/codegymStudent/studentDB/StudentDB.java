package com.codegymStudent.studentDB;

import com.codegymStudent.model.Student;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StudentDB {
    public static Map<Integer, Student> codeGymStudentList;
    public static int count;
    static {
        codeGymStudentList = new HashMap<>();
        count = 0;
    }
    public void saveFile() throws IOException {
        File file = new File("CGStudent.csv");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream("CGStudent.csv");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        for (Map.Entry<Integer, Student> entry : codeGymStudentList.entrySet()) {
            bufferedOutputStream.write(entry.getValue().toString().getBytes());
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
    }
    public void readFile() throws IOException {
        FileReader fileReader = new FileReader("CGStudent.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine())!= null){
           String[] arr = line.split(",");
           Student codeGymStudent = new Student(arr[0],Integer.parseInt(arr[1]),Float.parseFloat(arr[2]),Float.parseFloat(arr[3]),Float.parseFloat(arr[4]),Float.parseFloat(arr[5]),Float.parseFloat(arr[6]));
            add(codeGymStudent);
        }

        bufferedReader.close();
        fileReader.close();
    }
    public void add(Student codeGymStudent){
        count++;
        codeGymStudent.setId(count);
        codeGymStudentList.put(count, codeGymStudent);
    }

    public boolean remove(int id) throws Exception{
        boolean rs = (codeGymStudentList.remove(id) != null) ? false : true;
        return rs;
    }
}

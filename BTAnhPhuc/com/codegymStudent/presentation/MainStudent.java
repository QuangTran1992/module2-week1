package com.codegymStudent.presentation;

import com.codegymStudent.model.Student;
import com.codegymStudent.service.StudentService;
import com.codegymStudent.studentDB.StudentDB;

import java.io.IOException;
import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) throws IOException {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        int choose ;
        do {
            creatMenu();
            System.out.println("Enter your choose : ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    showListStudent();
                    break;
                case 2:
                    try {
                        addStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    try {
                        deleteStudent();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case 5:
                    System.out.println("5. input Score");
                    break;
                case 6:
                    System.out.println("6. Edit Score");
                    break;
                case 7:
                    System.out.println("7. Sort Student");
                    break;
                case 8:
                    System.out.println("8. Exit");
                    break;
                default:
                    System.out.println("your choose is not correct");


            }

        }while (choose!=8);


    }

    private static void deleteStudent() throws Exception {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();

        System.out.println("input id want to delete");
        int id = sc.nextInt();
        sc.nextLine();

        if (studentService.findStudent(id) != null) {
            studentService.delete(id);


        }
    }
    private static void editStudent() throws IOException {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();

        System.out.println("input id want to edit");
        int id = sc.nextInt();
        sc.nextLine();
        if (studentService.findStudent(id) != null) {
            studentService.findStudent(id).toStringSv();
            System.out.println("input name : ");
            String name = sc.nextLine();
            studentService.findStudent(id).setName(name);
            studentService.updateFile();
        }else
            System.out.println("id not available");


    }


    private static void addStudent() throws IOException {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();

        System.out.println("input name");
        String name = sc.nextLine();
        Student student = new Student(name,0);
        studentService.addStudent(student);

    }

    private static void showListStudent() {
        StudentService studentService = new StudentService();
        studentService.print();
    }

    public static void creatMenu(){

        System.out.println("1. See Student");
        System.out.println("2. Add Student");
        System.out.println("3. Edit Student");
        System.out.println("4. Delete Student");
        System.out.println("5. input Score");
        System.out.println("6. Edit Score");
        System.out.println("7. Sort Student");
        System.out.println("8. Exit");
    }

}

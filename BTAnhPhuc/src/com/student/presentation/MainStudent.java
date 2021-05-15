package com.student.presentation;

import com.student.dal.StudentDB;
import com.student.model.Student;

import java.io.IOException;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StudentDB studentDB = new StudentDB();
        Student st = new Student();
        studentDB.readFile();
        int  choose;
      do {
           createMenu();
          System.out.println("enter your choose : ");
          choose = sc.nextInt();
            sc.nextLine();
          switch (choose){
              case 1:
                  studentDB.display();
                  break;
              case 2:
                  System.out.println("input name");
                  String name = sc.nextLine();
                  st.setName(name);

                  System.out.println("input id");
                  int id = sc.nextInt();
                  st.setId(id);

                  System.out.println("input score1");
                  Float sc1 = sc.nextFloat();
                  st.setScore1(sc1);

                  System.out.println("input score2");
                  Float sc2 = sc.nextFloat();
                  st.setScore2(sc2);

                  System.out.println("input score3");
                  Float sc3 = sc.nextFloat();
                  st.setScore3(sc3);

                  System.out.println("input score4");
                  Float sc4 = sc.nextFloat();
                  st.setScore4(sc4);

                  studentDB.add(st);
                  studentDB.saveFile();
                   break;
              case 3:
                   id = sc.nextInt();
                  studentDB.edit(id);
                  break;
              case 4:
                   id = sc.nextInt();
                  try {
                      studentDB.delete(id);
                  } catch (Exception e) {
                      System.out.println(e.getMessage());
                  }

                  break;
              case 5:
                  System.exit(0);
              default:
                  System.out.println("your choose is not correct");
          }

      }while (choose != 5);

    }
    public static void createMenu(){
        System.out.println("Welcome !!!");
        System.out.println("1. See Student");
        System.out.println("2. Add Student");
        System.out.println("3.Edit Student");
        System.out.println("4.Delete Student");
        System.out.println("5. Exit");
    }

}

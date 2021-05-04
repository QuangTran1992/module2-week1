package com.student.presentation;

import com.student.dat.StudentDT;
import com.student.model.Student;

public class MainStudent {
    public static void main(String[] args) {
        Student st1 = new Student("Quang",1,23,"male");
        Student st2 = new Student("Quang2",2,24,"male");
        Student st3 = new Student("Quang3",3,24,"male");

        StudentDT sdt = new StudentDT();
        sdt.add(st1);
        sdt.add(st2);
        sdt.add(st3);
        sdt.display();
        System.out.println("***********");

//      sdt.delete(2);
//        sdt.edit();

//        sdt.saveFile();
        sdt.display();
//        sdt.saveFile();
//      sdt.add(st1);
//      sdt.display();



    }
}
//System.out.println("input your name");
//        String name = sc.nextLine();
//        cus.setName(name);
//
//        System.out.println("input your address");
//        String address = sc.nextLine();
//        cus.setAddress(address);
//
//        System.out.println("input your telephoneNumber");
//        String tel = sc.nextLine();
//        cus.setTelephoneNumber(tel);
//
//        System.out.println("input your email");
//        String email = sc.nextLine();
//        cus.setEmail(email);
//
//        System.out.println("input your gender");
//        String gender = sc.nextLine();
//        cus.setGender(gender);
//
//        System.out.println("order number");
//        int order = sc.nextInt();
//        cus.setDonHangDaMua(order);


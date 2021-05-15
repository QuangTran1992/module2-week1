package com.Health.service;

import com.Health.dal.PersonsDB;
import com.Health.model.Personconparator;
import com.Health.model.Persons;

import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonService {
    PersonsDB personsDB = new PersonsDB();
    Scanner sc = new Scanner(System.in);

    public void addPerson() throws IOException {
        String  name;
        do {
            System.out.println("input name ");
             name = sc.nextLine();
        }while (!name.matches("^[A-Z]\\w*\\s[A-Z]\\w*$"));


        System.out.println("input address ");
        String add = sc.nextLine();

        String tel;
        do {
            System.out.println("input correct tel (10 number) ");
            tel = sc.nextLine();
        }while (checkInputPhoneNumber(tel) == false);

        System.out.println("input gender : ");
        String gender ;
        do {
            System.out.println("Male/Female");
            gender = sc.nextLine();
        }
        while (!gender.equals("Male") && !gender.equals("Female"));


        System.out.println("did you delarec ??? ");
        String Check;
        do {
            System.out.println("Yes/No");
            Check = sc.nextLine();
        }
        while (!Check.equals("Yes") && !Check.equals("No"));

        Persons per1 = new Persons(name, add, tel, gender, Check);
        personsDB.add(per1);
        personsDB.sort();
        personsDB.saveFile();
    }

    public void deletePerson() throws IOException {
        System.out.println("input telephone want to delete ");
        String tele = sc.nextLine();
        personsDB.delete(tele);
        personsDB.saveFile();
    }

    public void editPerson() throws IOException {
        System.out.println("input telephone want to edit ");
        String tele = sc.nextLine();
        personsDB.edit(tele);
        personsDB.saveFile();
    }

    public void findPerson() {
        System.out.println("input telephone want to find ");
        String tele = sc.nextLine();
        personsDB.find(tele);
    }

    public static boolean checkInputPhoneNumber(String phone){
        String regex = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.find();
    }

    public void uploadFile() throws IOException {
        personsDB.readFile();
    }

    public void display1() {
        personsDB.listFalse();
    }

    public void display2() {
        personsDB.listTrue();
    }

    public void display3() {
        personsDB.display();
    }
}

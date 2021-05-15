package com.Health.dal;

import com.Health.model.Personconparator;
import com.Health.model.Persons;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PersonsDB {
    List<Persons> personsList = new ArrayList<>();

    Persons per = new Persons();
    Scanner sc = new Scanner(System.in);

    //    add đối tượng đã khai báo y te va chua khai bao
    public void add(Persons per) {
        for (int i = 0; i < personsList.size(); i++) {
            if (personsList.get(i).getTelephone().equals(per.getTelephone())) {
                return;
            }
        }
        personsList.add(per);
    }
    public void sort(){
        Personconparator personconparator = new Personconparator();
        Collections.sort(personsList ,personconparator);
    }
    public void listFalse(){
        for(int i=0;i<personsList.size();i++){
            if(personsList.get(i).getCheck().equals("No")){
                System.out.println(personsList.get(i).toString());
            }
        }
    }
    public void listTrue(){
        for(int i=0;i<personsList.size();i++){
            if(personsList.get(i).getCheck().equals("Yes")){
                System.out.println(personsList.get(i).toString());
            }
        }
    }

    public void delete(String tel){
        for (int i = 0; i < personsList.size(); i++) {
            if(personsList.get(i).getTelephone().equals(tel)){
                personsList.remove(i);
                return;
            }
        }
        System.out.println("Your telephone is not available");
    }
    public void edit(String tel){
        for (int i = 0; i < personsList.size(); i++) {
            if(personsList.get(i).getTelephone().equals(tel)){
                System.out.println("input name ");
                String name = sc.nextLine();
               personsList.get(i).setName(name);

                System.out.println("input address ");
                String add = sc.nextLine();
                personsList.get(i).setAddress(add);

                System.out.println("input gender ");
                String gender = sc.nextLine();
                personsList.get(i).setGender(gender);

                System.out.println("input Check (Yes or No) ");
                String check = sc.nextLine();
                personsList.get(i).setCheck(check);

            }
        }
        System.out.println("Your telephone is not available");

    }
    public void find(String tel){
        for (int i = 0; i < personsList.size(); i++) {
            if(personsList.get(i).getTelephone().equals(tel)) {
                System.out.println(personsList.get(i));
                return;
            }
        }
        System.out.println("Your telephone is not available");
    }
    public void saveFile() throws IOException {
        File file = new File("list.csv");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream("list.csv");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        for (int i = 0; i < personsList.size(); i++) {
            bufferedOutputStream.write(personsList.get(i).toStringCSV().getBytes());
        }
        bufferedOutputStream.close();
        fileOutputStream.close();
    }
    public void readFile() throws IOException {
        File file = new File("list.csv");
        if(!file.exists()){
            file.createNewFile();
        }
        FileReader fileReader = new FileReader("list.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] arr = line.split(",");
            Persons per = new Persons(arr[0],arr[1],arr[2],arr[3],arr[4]);
            System.out.println(per.toString());
            add(per);
        }
        bufferedReader.close();
        fileReader.close();
    }
    public void display(){
        for (int i = 0; i < personsList.size(); i++) {
            System.out.println(personsList.get(i).toString());
        }
    }
  }


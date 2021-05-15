package com.danhba.Service;

import com.danhba.dal.DanhBaDB;
import com.danhba.model.DanhBa;

import java.io.IOException;
import java.util.Scanner;

public class DanhBaService {
    DanhBaDB danhBaDB = new DanhBaDB();
    DanhBa per = new DanhBa();
    Scanner sc = new Scanner(System.in);

    public void addPerson(){

        danhBaDB.add(per);
        try {
            danhBaDB.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void edit(){
        String tel = sc.nextLine();
        danhBaDB.edit(tel);
        try {
            danhBaDB.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void delete(){
        String tel = sc.nextLine();
        danhBaDB.delete(tel);
        try {
            danhBaDB.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void find(){
        String tel = sc.nextLine();
        danhBaDB.find(tel);
    }
    public void readFile(){
        try {
            danhBaDB.readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void saveFile(){
        try {
            danhBaDB.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void display(){
        danhBaDB.display();
    }
}

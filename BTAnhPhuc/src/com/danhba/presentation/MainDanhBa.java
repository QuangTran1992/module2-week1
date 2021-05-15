package com.danhba.presentation;

import com.danhba.Service.DanhBaService;
import com.danhba.dal.DanhBaDB;
import com.danhba.model.DanhBa;

import java.util.Scanner;

public class MainDanhBa {
    public static void main(String[] args) {
        DanhBaService danhBaService = new DanhBaService();
        Scanner sc =  new Scanner(System.in);
        DanhBa per = new DanhBa();
        danhBaService.saveFile();
        int choose;
        while (true){
            creatMenu();
            choose = sc.nextInt();
            switch (choose){
                case 1 :
                    danhBaService.display();
                    break;
                case 2:
                    danhBaService.addPerson();
                    break;
                case 3:
                    System.out.println("input tel want to edit");
                    danhBaService.edit();
                    break;
                case 4:
                    System.out.println("input tel want to delete");
                   danhBaService.delete();
                    break;
                case 5:
                    System.out.println("input tel want to find");
                    danhBaService.find();
                    break;
                case 6:
                    danhBaService.readFile();
                    break;
                case 7:
                    danhBaService.saveFile();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
    public static void creatMenu(){
        System.out.println("WELCOME !!! ");
        System.out.println("1. SEE LIST ");
        System.out.println("2. ADD NEW PERSON ");
        System.out.println("3. EDIT  ");
        System.out.println("4. DELETE ");
        System.out.println("5. FIND");
        System.out.println("6. READ FROM FILE ");
        System.out.println("7. WRITE IN FILE");
        System.out.println("8. EXIT");
    }
}

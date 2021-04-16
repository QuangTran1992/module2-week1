package com.quang.atm;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        ATM atm = new ATM("Meiko", 10000);


        System.out.println("MENU");
        System.out.println("input 1 check acount");
        System.out.println("input 2 add amount");
        System.out.println("input 3 draw a mount");
        System.out.println("input 4 print history");
        System.out.println("input 5 exit ");

        System.out.println("enter your choice : ");
        int choice;
        Scanner sc = new Scanner(System.in);

        boolean condition = true;
        while (condition == true) {
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("input 1 check acount");
                    atm.displayAmount();
                    break;
                case 2:
                    System.out.println("input 2 add amount");

                    break;
                case 3:
                    System.out.println("input 3 draw a mount");
                    break;
                case 4:
                    System.out.println("input 4 print history");
                    break;
                case 5:
                    System.out.println("input 5 exit ");
                    break;
                default:
                    System.out.println("your input was wrong ");
            }


        }
    }
}
package com.customer.presentation;

import com.customer.data.CustomerDT;
import com.customer.model.Customer;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class testCustomer {
    public static void main(String[] args) {
        CustomerDT customerDT = new CustomerDT();
        try {
            customerDT.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        int choose;
        do {

            crateMenu();
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    CustomerDT customerDT1 = new CustomerDT();
                    System.out.println("input name");
                    String name = sc.nextLine();

                    System.out.println("input address");
                    String address = sc.nextLine();

                    System.out.println("input tel");
                    String tel = sc.nextLine();


                    System.out.println("input email");
                    String email = sc.nextLine();

                    System.out.println("input gender");
                    String gender = sc.nextLine();

                    System.out.println("input oder");
                    int oder = sc.nextInt();
                    sc.nextLine();

                    Customer customer = new Customer(name,address,tel,email,gender,oder);

                    try {
                        customerDT1.addCustomer(customer);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    System.out.println("Bấm 2 để tim kiem khach hang");
                    CustomerDT customerDT3 = new CustomerDT();
                    customerDT3.findCustomer();
                    break;
                case 3:

                    System.out.println("Bam 3 de in thong khach hang");
                    CustomerDT customerDT2 = new CustomerDT();
                    customerDT2.showCustomer();



                    break;
                case 4:
                    System.out.println("Bam 4 de in toan bo danh sach khach hang");
                    CustomerDT customerDT4 = new CustomerDT();
//                    try {
//                        customerDT4.readFile();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
                    customerDT4.display();
                    break;
                case 5:
                    System.out.println("Bam 5 de tang so don hang cho khach");
                    CustomerDT customerDT6 = new CustomerDT();
                    try {
                        customerDT6.upOder();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    CustomerDT customerDT5 = new CustomerDT();
                    try {
                        customerDT5.deleteCustomer();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case 0:
                    System.out.println("Bam 0 de thoat");
                    break;

                default:
                    System.out.println("input your choose again");
                    break;
            }
        } while (choose != 0);
    }

    public static void crateMenu() {
        System.out.println("Chao mung ban den voi he thong quan ly khach hang");
        System.out.println("Bấm 1 để nhập khách hang");
        System.out.println("Bấm 2 để tim kiem khach hang");
        System.out.println("Bam 3 de in thong khach hang");
        System.out.println("Bam 4 de in toan bo danh sach khach hang");
        System.out.println("Bam 5 de tang so don hang cho khach");
        System.out.println("Bam 6 de xoa khach hang ");
        System.out.println("Bam 0 de thoat");
        System.out.println("enter your choose :  ");

    }


//
//    public static void main(String[] args) {
//        Customer cus1 = new Customer("Meimei","Hanoi","090123456","meimei@gmail.com","female",2);
//        Customer cus2 = new Customer("Ayako","Hanoi","090123456","meimei@gmail.com","female",3);
//        Customer cus3 = new Customer("Natsumi","Hanoi","090123456","meimei@gmail.com","female",4);
//
//        CustomerDT cus = new CustomerDT();
//
//        cus.add(cus1);
//        cus.add(cus2);
//        cus.add(cus3);
//        cus.display();
//        cus.findCustomer();
}




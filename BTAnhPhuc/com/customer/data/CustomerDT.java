package com.customer.data;

import com.customer.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerDT {
    public static List<Customer> customerList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public static Customer cus = new Customer();



    public void saveFile() throws IOException {
        File file = new File("Customer.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream("Customer.csv");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        byte[] b;
        for (int i = 0; i < customerList.size(); i++) {
            b = customerList.get(i).toString().getBytes();
            bufferedOutputStream.write(b);
        }
        bufferedOutputStream.flush();
    }
    public void readFile() throws IOException {

        FileReader fileReader = new FileReader("Customer.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            Customer customer = new Customer(arr[0],arr[1],arr[2],arr[3],arr[4],Integer.parseInt(arr[5]));
            addCustomer(customer);
        }
        bufferedReader.close();
        fileReader.close();
    }
    public void addCustomer(Customer cus) throws IOException {
//        for(int i = 0 ;i < customerList.size();i++) {
//            if (customerList.get(i).getTelephoneNumber().equals(cus.getTelephoneNumber())) {
//                System.out.println("this telephoneNumber is available");
//                return;
//            }
//        }
        customerList.add(cus);
        saveFile();
    }
    public void findCustomer(){
        System.out.println("input telephoneNumber ");
        String telephoneNumber = sc.nextLine();
        for(int i = 0 ;i < customerList.size();i++){
            if(customerList.get(i).getTelephoneNumber().equals(telephoneNumber)){
//                System.out.println("your telephoneNumber is available");
                System.out.println(customerList.get(i));
                break;
            } else System.out.println("your telephoneNumber is available");;
        }
    }

    public void deleteCustomer() throws IOException {
        System.out.println("input telephoneNumber ");
        String telephoneNumber = sc.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getTelephoneNumber().equals(telephoneNumber)) {
                System.out.println("your telephoneNumber is available");
                System.out.println(customerList.get(i));
                customerList.remove(i);
                System.out.println("delete completed");
            }
        }
        saveFile();
    }
    public void upOder() throws IOException {
        System.out.println("input telephoneNumber want to up oder ");
        String telephoneNumber = sc.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getTelephoneNumber().equals(telephoneNumber)) {
                System.out.println(" input oder want to up");
                int upOder = sc.nextInt();
               int result =  customerList.get(i).getDonHangDaMua();
                customerList.get(i).setDonHangDaMua(result + upOder);
                System.out.println("up oder complete");
            }
        }
        saveFile();
    }
    public void showCustomer() {

        System.out.println("input telephone want to see ");
        String tel = sc.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getTelephoneNumber().equals(tel)) {
                System.out.println(customerList.get(i).toString());

            }

        }
    }

    public void display(){
        for (Customer A: customerList
             ) {
            System.out.println(A.toString());
        }
    }


}

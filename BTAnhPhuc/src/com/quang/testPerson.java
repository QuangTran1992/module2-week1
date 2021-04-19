package com.quang;

import java.util.Scanner;

public class testPerson {


    public static void main(String[] args) {
        ATM atm = new ATM("Nguyen Van A", 1200000);
        char choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Nhấn phím A để kiểm tra tài khoan ");
        System.out.println("2. Nhấn phím D để nạp tiền  ");
        System.out.println("3. Nhấn phím W để rút  ");
        System.out.println("4. Nhấn phím H để xem lịch sử lần 3 ");
        System.out.println("5. Nhấn phím X để thoát ");

        System.out.println("Nhập lụa chọn của ban : ");
        boolean condition = true;
        while (condition){
            choice = sc.next().charAt(0);

            switch (choice) {
                case 'A':
                    atm.displayAmount();
                    break;
                case 'D':
                    System.out.println("Giao dich Nap tien");
                    System.out.println("Vui long nhap so tien:");
                    int amount = sc.nextInt();
                    atm.addMoney(amount);
                    System.out.println("Giao dich thanh cong. Ban vua nap"+ amount +"thanh cong.");
                    atm.displayAmount();
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    break;

                case 'W':
                    System.out.println("Giao dich Rut tien:");
                    System.out.println("Vui long nhap so tien:");
                    amount = sc.nextInt();
                    boolean check = atm.withdrawMoney(amount);
                    if (check) {
                        System.out.println("Giao dich thanh cong. Ban vua rut " + amount + " thanh cong.");
                        atm.displayAmount();
                    } else {
                        System.out.println("Giao dich khong thanh cong");
                        atm.displayAmount();
                        System.out.println("Ban khong the rut so tien hon so du tai khoan");
                    }
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    break;

                case 'H':
                    System.out.println("Lich su giao dich");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + 1 + ". " + atm.history.get(i));
                    }
                    break;
///lich su em du hoc ben c10 tham khao chua hieu lam
                case 'X':
                    System.out.println("Cam on ban da su dung dich vu ATM");
                    condition = false;
                    break;
                default:
                    System.out.println("Ban nhap sai chuc nang");
                    condition = false;
            }
        }
    }
}

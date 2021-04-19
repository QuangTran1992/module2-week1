package com.quang;

import java.util.ArrayList;

public class ATM {
    public String name;
    public int amount;
    public ArrayList<String> history;

//    Array list em di du hoc ben c10
    public ATM() {
        this.history = new ArrayList<>();
    }

    public ATM(String name, int amount) {
        this.name = name;
        this.amount = amount;
        this.history = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displayAmount(){
        System.out.println("So du tai khoan khach hang la: " + this.amount + " vnd");
    }

    public void addMoney(int amount){
        this.amount += amount;
        history.add(0, "Nap tien: " + amount + " vnd");
    }

    public boolean withdrawMoney(int amount){
        if(this.amount > amount){
            this.amount -= amount;
            history.add(0, "Rut tien: " + amount + " vnd");
            return true;
        }
        return false;
    }
}

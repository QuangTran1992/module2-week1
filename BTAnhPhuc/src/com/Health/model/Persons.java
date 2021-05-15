package com.Health.model;

public class Persons  implements Comparable<Persons>{
    String name;
    String address;
    String telephone;
    String gender;
    String check ;

    public Persons() {
    }

    public Persons(String name, String address, String telephone, String gender, String check) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.gender = gender;
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
    @Override
    public int compareTo(Persons persons){
        return this.getName().compareTo(persons.getName());
    }

    public String toStringCSV() {
        return name + "," + address + "," + telephone +"," + gender + "," + check +"\n" ;
        }

    @Override
    public String toString() {
        return "Name : " + name + " , Address : " + address + " , Telephone : " + telephone + " , Gender : " + gender + " , Status : " + check + "\n";
    }
}

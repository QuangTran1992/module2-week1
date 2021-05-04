package com.customer.model;

public class Customer {
    private String name;
    private String address;
    private String telephoneNumber;
    private String email;
    private String gender;
    private int donHangDaMua;

    public Customer() {
    }

    public Customer(String name, String address, String telephoneNumber, String email, String gender, int donHangDaMua) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.gender = gender;
        this.donHangDaMua = donHangDaMua;
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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDonHangDaMua() {
        return donHangDaMua;
    }

    public void setDonHangDaMua(int donHangDaMua) {
        this.donHangDaMua = donHangDaMua;
    }

    @Override
    public String toString() {
        return name +","+address+","+telephoneNumber+","+email+","+gender+","+donHangDaMua+"\n" ;
    }

}

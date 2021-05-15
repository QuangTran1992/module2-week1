package com.danhba.model;

public class DanhBa {
    String name;
    String tel;
    String group;
    String gender;
    String address;
    String dateOfBirth;
    String email;

    public DanhBa() {
    }

    public DanhBa(String name, String tel, String group, String gender, String address, String dateOfBirth, String email) {
        this.name = name;
        this.tel = tel;
        this.group = group;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + "," + tel + "," + group + "," + gender + "," + address + "\n";
    }

    public String toStringCSV() {
        return name + "," + tel + "," + group + "," + gender + "," + address + dateOfBirth +"," + email +"\n";
    }
}
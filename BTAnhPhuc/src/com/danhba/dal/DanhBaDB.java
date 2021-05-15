package com.danhba.dal;

import com.danhba.model.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhBaDB {
    List<DanhBa> danhBaList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void add(DanhBa per){
        for (int i = 0 ; i < danhBaList.size();i++){
            if(danhBaList.get(i).getTel().equals(per.getTel())){
                System.out.println("tel is available");
                return;
            }
        }
        System.out.println("input name");
        String name = sc.nextLine();

        System.out.println("input telephone");
        String tel = sc.nextLine();

        System.out.println("input group");
        String group = sc.nextLine();

        System.out.println("input gender");
        String gender = sc.nextLine();

        System.out.println("input address");
        String add = sc.nextLine();

        System.out.println("input date of birth");
        String db =sc.nextLine();

        System.out.println("input email");
        String  email = sc.nextLine();

        DanhBa pe = new DanhBa(name,tel,group,gender,add,db,email);

        danhBaList.add(pe);

    }
    public void delete(String tel){
        for( int i = 0 ; i < danhBaList.size();i++){
            if(danhBaList.get(i).getTel().equals(tel) ){
                danhBaList.remove(i);
                return;
            }
        }
        System.out.println("Tel is not available");
    }
    public void edit(String tel){
        for ( int i = 0; i < danhBaList.size();i++){
            if (danhBaList.get(i).getTel().equals(tel)){

                System.out.println("input name want to edit ");
                String name = sc.nextLine();
                danhBaList.get(i).setName(name);

                System.out.println("input group want to edit");
                String group = sc.nextLine();
                danhBaList.get(i).setGroup(group);

                System.out.println("input gender want to edit");
                String gender = sc.nextLine();
                danhBaList.get(i).setGroup(gender);

                System.out.println("input address want to edit");
                String add = sc.nextLine();
                danhBaList.get(i).setGroup(add);

                System.out.println("input dateOfBirth want to edit");
                String bd = sc.nextLine();
                danhBaList.get(i).setGroup(bd);

                System.out.println("input email want to edit");
                String email = sc.nextLine();
                danhBaList.get(i).setGroup(email);

            }
        }
    }
            public void find(String tel){
                for (int i = 0; i < danhBaList.size(); i++) {
                    if(danhBaList.get(i).getTel().equals(tel)){
                        System.out.println(danhBaList.get(i));
                        return;
                    }
                }
                System.out.println("Tel is not availble");
                }

            public void saveFile() throws IOException {
                File file =  new File("danhba.csv");
                if(!file.exists()){
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream("danhba.csv");
                byte[] b;
                for (int i = 0; i < danhBaList.size(); i++) {
                    b = danhBaList.get(i).toStringCSV().getBytes();
                    fileOutputStream.write(b);
                }
                fileOutputStream.flush();
            }
            public void readFile() throws IOException {
                File file = new File("danhba.csv");
                if(!file.exists()){
                    file.createNewFile();
                }
                FileReader fileReader = new FileReader("danhba.csv");
                BufferedReader bufferedReader =  new BufferedReader(fileReader);

                String line;
                while ((line = bufferedReader.readLine())!= null){
                    String[] arr = line.split(",");
                    DanhBa danhba = new DanhBa(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]);
                    add(danhba);
                }
                bufferedReader.close();
                fileReader.close();
            }
            public void display(){
                for (int i = 0; i < danhBaList.size(); i++) {
                    System.out.println(danhBaList.get(i).toString());
                }
            }
}


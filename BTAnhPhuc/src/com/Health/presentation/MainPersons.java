package com.Health.presentation;

import com.Health.service.PersonService;

import java.io.IOException;
import java.util.Scanner;

public class MainPersons {
    public static void main(String[] args) throws IOException {
        PersonService personService = new PersonService();
        Scanner sc =  new Scanner(System.in);
        int choose;
        while (true){
            createMenu();
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("1. WELCOME ");
                    break;
                case 2:
                    personService.display3();
                    break;
                case 3:
                    personService.display1();
                    break;
                case 4:
                    personService.display2();
                    break;
                case 5:
                    personService.addPerson();
                    break;
                case 6:
                    personService.deletePerson();
                    break;
                case 7:
                    personService.findPerson();
                    break;
                case 8:
                    personService.editPerson();
                    break;
                case 9:
                    personService.uploadFile();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("your choose is wrong ");
            }
        }

    }
    public static void createMenu(){
        System.out.println("1. WELCOME ");
        System.out.println("2. SEE ALL LIST ");
        System.out.println("3. SEE DIT NOT DECLARE PERSONS ");
        System.out.println("4. SEE DECLARED PERSONS ");
        System.out.println("5. ADD PERSON ");
        System.out.println("6. DELETE PERSON ");
        System.out.println("7. FIND PERSON ");
        System.out.println("8. EDIT PERSON ");
        System.out.println("9. READ FILE");

        System.out.println("10. EXIT ");
    }
}

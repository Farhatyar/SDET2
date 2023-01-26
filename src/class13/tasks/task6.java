package class13.tasks;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter your name and last name: ");
        String name= scan.next();
        String lName=scan.next();


        System.out.println("Before : "+name+" "+lName);

        name=name+lName;

        lName=name.substring(0,lName.length());
        name=name.substring(lName.length());


    }
}

package class16.AccessModifiers;

import java.util.Scanner;

public class Person {

    private double bankBalance=1250000; //access within the same class
    String address="123, Street"; //the default access level is applied
    public String name="John Snow";

    private void printPhonePassword(){
        System.out.println("pass123");
    }
    void printSSN(){
        System.out.println("12345677");
    }
    public void printTiktokAcc(){
        System.out.println("user587");
    }

    public static void main(String[] args) {
        Person person1=new Person();
        System.out.println(person1.bankBalance);
        System.out.println(person1.address);
        System.out.println(person1.name);
        person1.printPhonePassword();
        person1.printSSN();
        person1.printTiktokAcc();

        Scanner scanner=new Scanner(System.in);
    }

}

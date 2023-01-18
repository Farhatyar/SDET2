package class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter your name: ");

        while (scan.next().equalsIgnoreCase("Shah")){
            System.out.println("A good student");
        }
        System.out.println("No one is good except Shah");
    }
}

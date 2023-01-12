package class7;

import java.util.Scanner;

public class forLoops7 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number you wanna have table of: ");
            int numberWeWannaMakeTableOf=scan.nextInt();
            if (numberWeWannaMakeTableOf>0) {
                for (int i = 1; i < 11; i++) {
                    System.out.println(i + "*" + numberWeWannaMakeTableOf + " equals to " + (i * numberWeWannaMakeTableOf));
                }
            }else {
                System.out.println("please enter a positive number");
            }
        }
    }
}

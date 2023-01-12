package class7;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        boolean workday=true;

        System.out.println("What is the number of the day in the week");
        int day= scan.nextInt();

        while (workday){
            if (day<=5){
                System.out.println("I need a day off");
            }else if (day==6 || day==7) {
                System.out.println("I don't need a day off");
            }else {
                System.out.println("Invalid input");
            }
            workday=false;
            day++;
        }

    }
}

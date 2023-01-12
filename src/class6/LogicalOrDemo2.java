package class6;

import java.util.Scanner;

public class LogicalOrDemo2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter the day of the week");

        String day=scan.next();

        if (day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No class today");

        } else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) {
            System.out.println("We have Java class");

        }else if (day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")) {
            System.out.println("Manual Testing Class");

        }else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review Class");

        }else {
            System.out.println("Invalid Input");
        }

        scan.close();
    }
}
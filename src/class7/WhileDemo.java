package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

        //this is a number guessing game
        //user should guess what number we have choses
        //however, we can give them hints

        boolean condition=true;
        Scanner scan= new Scanner(System.in);

        int numberWeChose=12;

        while (condition){
            System.out.println("Please enter a number between 10 to 20");
            int userInputs= scan.nextInt();

            if (userInputs>numberWeChose){
                System.out.println("Your number is greater");
            } else if (userInputs<numberWeChose) {
                System.out.println("Your number is smaller");
            }else {
                System.out.println("You won!!!");
                condition=false;
            }

        }

    }
}

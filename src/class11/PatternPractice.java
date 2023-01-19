package class11;

public class PatternPractice {
    public static void main(String[] args) {
        /*
        print

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *


         */

        for (int i=1; i<=4; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 3; i >0 ; i--) {
            for (int j = i; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

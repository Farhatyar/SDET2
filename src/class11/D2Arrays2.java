package class11;

import java.util.Arrays;

public class D2Arrays2 {
    public static void main(String[] args) {
        int [][] matrix ={
                {10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };

        //print how many numbers are in the entire 2D array
        int countElements=0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                countElements++;
            }
        }
        System.out.println("There are "+countElements+
                " elements in the array");

    }
}

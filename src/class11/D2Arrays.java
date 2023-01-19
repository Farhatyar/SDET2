package class11;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
        int [][] matrix ={
                {10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };

        //print only one 1D array
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println("***************");

        //how to do it with a loop
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[0][i]+" ");
        }
        System.out.println();
        System.out.println("***************");

        //or
        int []arr=matrix[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr [i]+" ");
        }
        System.out.println();
        System.out.println("***************");

        //print the entire 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
    }
}

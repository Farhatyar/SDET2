package class11;

public class D2Arrays3 {
    public static void main(String[] args) {
        int [][] matrix ={
                {10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };

        //print the sum of all numbers in the 2D array

        int sum=0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];

            }

        }
        System.out.println("The sum of all the numbers int the" +
                "array is : "+sum);
    }
}

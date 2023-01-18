package class10;


import java.util.Arrays;

public class D2Arrays4 {
    public static void main(String[] args) {

        int [][] matrix= {{10 ,20 ,30},
                          {55, 227 ,45},
                          {443, 87, 99}
        };

        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

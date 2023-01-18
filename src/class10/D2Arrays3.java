package class10;


import java.util.Arrays;

public class D2Arrays3 {
    public static void main(String[] args) {

        int [][] matrix= {{10 ,20 ,30},
                          {55, 227 ,45},
                          {443, 87, 99}
        };

        System.out.println(matrix[1][1]);
        System.out.println(Arrays.toString(matrix[2]));

        //re-assigning
        matrix[2][1]=70;
        System.out.println(Arrays.toString(matrix[2]));
    }
}

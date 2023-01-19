package class11;

public class D2Arrays5 {
    public static void main(String[] args) {
        int [][] matrix ={
                {10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };

        //print odd numbers using enhanced for loop

        for (int [] arr: matrix) {
            for (int number :arr){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}

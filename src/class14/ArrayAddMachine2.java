package class14;

public class ArrayAddMachine2 {
    public static void main(String[] args) {
        double [][] d2Array={
                {1.7 ,2.8 ,4.4},
                {11.45, 12.12, 13.98},
                {987.44, 656.32, 98.1019},
                {121.99, 101.1},
        };


        print2DArrays(d2Array);
        add2DArrays(d2Array);


    }
    static void print2DArrays(double [][] array){
        for (double numbers []:array){
            for (double number :numbers){
                System.out.print(number+", ");
            }
            System.out.println();
        }
    }
    static void add2DArrays(double [][] array){
        double sum=0;
        for (double numbers[]:array){
            for (double number:numbers){
                sum=number+sum;
            }
        }
        System.out.println("Sum of all the elements in the " +
                "2D Array is : "+sum);
    }
}


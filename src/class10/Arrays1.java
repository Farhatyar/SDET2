package class10;

public class Arrays1 {
    public static void main(String[] args) {

        int arr []= {10, 20, 30, 40, 50};

        //same as:

        int []array= new int[5];
        array [0]=10;
        array [1]=20;
        array [2]=30;
        array [3]=40;
        array [4]=50;

        for (int i=0; i< array.length; i++){
            System.out.println(array[i]+" ");
        }

        System.out.println("**********");

        for (int number: arr){
            System.out.println(number);
        }

    }
}

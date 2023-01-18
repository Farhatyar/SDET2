package class9;

public class Arrays5 {
    public static void main(String[] args) {

        // create an array and store 10,20,30,4,5,6,7,80
        // add all the element which are multiple of 2

        int []numbers= new int[8]; // an empty array of size 5 will be created

        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=4;
        numbers[4]=5;
        numbers[5]=6;
        numbers[6]=7;
        numbers[7]=80;

        int sumOfMultipleOf_2=0;

        for (int i=0; i<numbers.length; i++){
            if (numbers[i]%2==0){
                sumOfMultipleOf_2+=numbers[i];
            }
        }
        System.out.println(sumOfMultipleOf_2);


    }
}

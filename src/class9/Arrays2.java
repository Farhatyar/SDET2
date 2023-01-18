package class9;

public class Arrays2 {
    public static void main(String[] args) {

        int []numbers={10,20,30,45,50};

        int sum=0;
        //to print all
        for (int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
            sum=sum+numbers[i];
        }
        System.out.println(sum);

    }
}

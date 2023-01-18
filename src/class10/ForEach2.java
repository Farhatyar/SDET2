package class10;

public class ForEach2 {
    public static void main(String[] args) {

        int [] arr= {10,13,20,25,45, 50};

        for (int number: arr){
            if (number%2==1){
                System.out.println(number);
            }
        }
        System.out.println("***************");

        for (int num : arr){
            if (num<51){
                System.out.print(num+" ");
            }
        }
    }
}

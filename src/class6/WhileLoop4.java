package class6;

public class WhileLoop4 {
    public static void main(String[] args) {

        int number=10;
        while (number>0){
            System.out.println(number);
            number--;
        }
        int number2=1;
        int sum=0;
        while (number2<=10){
            sum=sum+number2;
            number2++;
        }
        System.out.println(sum);
    }
}

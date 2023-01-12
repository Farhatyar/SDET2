package class7;

public class WhileLoops {
    public static void main(String[] args) {
        int number=10;
        while (number<20){
            System.out.println(number);
            if (number<15){
                System.out.println("Number is less than 15");
            }else if (number>15){
                System.out.println("Number is greater than 15");
            }else {
                System.out.println("Number is equal to 15");
            }
            number++;
        }
    }
}

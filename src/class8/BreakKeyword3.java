package class8;

public class BreakKeyword3 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=79;

        do {
            if (summer && temp<=100){
                System.out.println("I love summer");
            }
            temp+=5;

        }while (temp<=100);

        System.out.println("It's too hot now");
    }
}

package class8;

public class BreakKeyword2 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=79;

        while (summer){
            if (temp<=100){
                System.out.println("I love summer");
            }else {
                System.out.println("It's too hot now");
                break;
            }
            temp+=5;
        }
    }
}

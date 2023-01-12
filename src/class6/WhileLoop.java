package class6;

public class WhileLoop {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        int number=1;
        if (number<3){
            System.out.println("Hello");
        }
        number++;
        if (number<3){
            System.out.println("Hello");
        }

        number++;
        if (number<3){
            System.out.println("Hello"); //won't print this time cuzz number=3 --!<3
        }
        //---------------------------------------------------------------------

        int number2=0;
        while (number2<3){
            System.out.println("Salam");
            number2++;
        }
    }
}

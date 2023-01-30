package class16;

public class ternaryOperator {
    public static void main(String[] args) {

        int number=0;

        if (3>2){
            number=10;
        }else {
            number=20;
        }

        System.out.println(number);

        //another way

        number=(3<2)?10:20;
        System.out.println(number);

        number=(3>2)?(4>5)?10:20:30;
        System.out.println(number);

        //or directly print
        System.out.println((3>2)?55:65);
        System.out.println((3<2)?32:80);

    }
}

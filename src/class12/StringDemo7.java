package class12;

public class StringDemo7 {
    public static void main(String[] args) {

       String str="I love Java";

       boolean startsWith=str.startsWith("I");
       System.out.println(startsWith);

       boolean startsWith2=str.startsWith("I love");
        System.out.println(startsWith2);

        boolean startsWith3=str.startsWith("I lov");
        System.out.println(startsWith3);

        System.out.println("*****************");

        boolean endsWith=str.endsWith("ava");
        System.out.println(endsWith);

        boolean endsWith2=str.endsWith("Ava");
        System.out.println(endsWith2);

        System.out.println("****************");

        /*  method chaining
        when multiple methods are called on the same line
        method chaining only works if the previous method returns
        a string
         */

        System.out.println(str.toLowerCase().startsWith("i"));

        System.out.println("****************");

        //contains
        System.out.println(str.contains("java"));

    }
}

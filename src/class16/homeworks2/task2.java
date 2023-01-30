package class16.homeworks2;

public class task2 {

    /*
    Create a method that will take a String as a parameter
    and returns reversed String. Method should be available to
    all classes within your project and accessible by class name.
     */

    public static String reverse (String a){
        return new StringBuilder(a).reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(reverse("Omid"));
    }
}

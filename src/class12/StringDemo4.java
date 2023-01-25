package class12;

public class StringDemo4 {
    public static void main(String[] args) {

        String str="   ";

        System.out.println(str.isEmpty());

        //or
        boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty);

        //and
        //it doesn't count spaces either
        System.out.println(str.isBlank());


    }
}

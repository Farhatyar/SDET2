package class12;

public class StringDemo {
    public static void main(String[] args) {

        //creating an object of String class
        String strObj= new String("Java");


        //another way of creating an object of string class a shorter way
        //mostly this is how we create the objects of String class
        String strObj2="Java";

        System.out.println(strObj2.length());

        String str="Banana ";
        System.out.println(str.length());
        int l=str.length(); //so we could use it in any case
        // for example: your password can not be less than 8 characters

        String name="Rafik Humayoun";
        if (name.length()>10){
            System.out.println("Name can not be greater than 10 characters");
        }
    }
}

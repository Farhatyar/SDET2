package class12;

public class StringDemo5 {
    public static void main(String[] args) {

       String str="Java";
       String str2="java";

       boolean areEqual=str2.equals(str);
       System.out.println(areEqual);

       boolean areEqual2=str2.equalsIgnoreCase(str);
        System.out.println(areEqual2);

    }
}

package class13;

public class StringDemo2 {
    public static void main(String[] args) {

        //Replace All Demo

        String str="kajshfkhasdk YTROIWUMNMNXA765HSL fkhaslkfhk 21987918723 $%^&";

        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-z]","~"));
        System.out.println(str.replaceAll("[0-9]","?"));

        System.out.println(str.replaceAll("[A-Za-z]","?"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","?"));

        //not operator - SPECIAL characters
        System.out.println(str.replaceAll("[^A-Za-z0-9]"," "));

        //REMOVE
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));

    }
}

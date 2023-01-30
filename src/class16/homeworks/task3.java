package class16.homeworks;

public class task3 {

    void palindrome(String a){
        String b=new StringBuilder(a).reverse().toString();
        if (b.equalsIgnoreCase(a)){
            System.out.println( a+" is a palindrome word");
        }
        else {
            System.out.println( a+" is not a palindrome word");
        }
    }
}

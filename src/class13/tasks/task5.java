package class13.tasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        String word="Omid";
        String reverse=new StringBuilder (word).reverse().toString();

        if (word.equals(reverse)){
            System.out.println(word+ " is a palindrome word");
        }else {
            System.out.println(word+ " is not a palindrome word");

        }

    }
}

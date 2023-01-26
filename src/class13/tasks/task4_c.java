package class13.tasks;

public class task4_c {
    public static void main(String[] args) {

        /*
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */

        //another way to do it

        String str="This is the sentence I want to reverse";

        String []strArray=str.split(" ");


        for (String word: strArray) {
            System.out.print(new StringBuilder(word).reverse()+" ");
        }
    }
}

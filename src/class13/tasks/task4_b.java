package class13.tasks;

public class task4_b {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */

        //another way to do it

        String str="This is the sentence I want to reverse";

        String []strArray=str.split(" ");


        for (int i = 0; i < strArray.length ; i++) {
            for (int j = strArray[i].length()-1; j >=0; j--) {
                System.out.print(strArray[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}

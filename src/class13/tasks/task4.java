package class13.tasks;

public class task4 {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */

        StringBuilder st= new StringBuilder("This is the sentence I want to reverse");

        st.reverse();
        System.out.print(st+" ");
        System.out.println();

        String str=st.toString();

        String []strArray=str.split(" ");

        for (int i = strArray.length-1; i >=0 ; i--) {
            System.out.print(strArray[i]+" ");
        }
    }
}

package class12;

public class StringDemo8 {
    public static void main(String[] args) {

       String str="I love Java";

       char c=str.charAt(0);
        System.out.println(c);

        System.out.println("********************");

        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        int countA=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='a'){
                countA++;
            }
        }
        System.out.println();
        System.out.println("Letter 'A' is mentioned: "+countA+" times");
    }
}

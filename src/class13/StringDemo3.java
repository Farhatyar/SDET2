package class13;

public class StringDemo3 {
    public static void main(String[] args) {

        String str = "I like java. I write a lot of code daily. I am form batch 15.";
        String [] strArr= str.split("[.?!]");

        System.out.println(strArr.length);

        for (int i = 0; i < strArr.length; i++) {

            System.out.println(strArr[i].trim());
        }

    }
}

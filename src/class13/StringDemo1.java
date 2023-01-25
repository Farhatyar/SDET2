package class13;

public class StringDemo1 {
    public static void main(String[] args) {

        String str="I love summer when it's not too hot.";
        System.out.println(str.replace('s', 'S'));

        System.out.println(str.replace(str.charAt(7), 'B'));
        //still doing the same thing

        System.out.println(str.replace("summer", "Bummer"));
    }
}

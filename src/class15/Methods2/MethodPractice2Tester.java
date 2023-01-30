package class15.Methods2;

public class MethodPractice2Tester {
    // create a method that takes a String, reverse it and
    //return the reversed String
    //call the method reverseStr
    public static void main(String[] args) {

        MethodPractice2 word=new MethodPractice2();

        System.out.println(word.reverseStr("Sunday"));
        System.out.println(word.reverseStr1("Saturday"));
    }
}

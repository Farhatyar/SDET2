package class15.Methods1;

public class MethodPracticeTester {
    // create a message turns true or false and take INT numbers as a parameter
    // if number is even it returns true otherwise it returns false

    public static void main(String[] args) {
        MethodPractice obj = new MethodPractice();

        boolean check = obj.isEven(8);
        System.out.println(check);
        check = obj.isEven(9);
        System.out.println(check);

        //call even method for the numbers 100, 12, 20

        boolean check2 = obj.isEven(100);
        System.out.println(check2);
        //or
        System.out.println(obj.isEven(12));
        System.out.println(obj.isEven(20));

    }
}
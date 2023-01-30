package class15.Methods1;

public class MethodPractice {
    // create a message turns true or false and take INT numbers as a parameter
    // if number is even it returns true otherwise it returns false

    public static void main(String[] args) {
        MethodPractice obj=new MethodPractice();

        boolean check=obj.isEven(8);
        System.out.println(check);
        check= obj.isEven(9);
        System.out.println(check);
    }

    boolean isEven(int a){
        return a%2==0;
    }
}

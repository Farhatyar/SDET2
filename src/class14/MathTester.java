package class14;

public class MathTester {
    public static void main(String[] args) {

        Math obj=new Math();

        obj.addTwoNumbers(10,10);
        obj.multiplyNumbers(2,3,5);

        int resultOfSubtraction=obj.subtract(100,50);
        System.out.println(resultOfSubtraction);
    }
}

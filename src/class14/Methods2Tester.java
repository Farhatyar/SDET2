package class14;

public class Methods2Tester {
    public static void main(String[] args) {

        //creating an object of class Methods2
        Methods2 obj= new Methods2();

        //calling printHello method
        obj.printHello();

System.out.println("*************");

        obj.printHelloManyTimes(4);

System.out.println("*************");

                                    //passing an input
        obj.printSomethingManyTimes(3,"I love java!");
    }
}

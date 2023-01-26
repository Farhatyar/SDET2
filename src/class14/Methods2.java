package class14;

public class Methods2 {

    //defining a method
    void printHello(){
        System.out.println("Hello World");
    }

    void printHelloManyTimes(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Hello world");
        }
    }

                                //defining an input
    void printSomethingManyTimes(int times, String word){
        for (int i = 1; i <= times; i++) {
            System.out.println(i+". "+word);
        }
    }
}

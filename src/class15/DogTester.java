package class15;

public class DogTester {
    public static void main(String[] args) {

        System.out.println("Start");

        Dog dog1=new Dog();
        dog1.printFood();

        System.out.println("End");
        /*String food only exists in memory while it's on action
        after that they stop occupying memory
        -this is a local variable

        but Strings name, breed and color exist in the memory the
        moment we create dog1 object - those are instance variables
         */


    }
}

package class12;

public class CarTester {
    public static void main(String[] args) {

        Car bmw= new Car();

        bmw.make="BMW";
        bmw.color="White";
        bmw.model="i7";
        bmw.year=2023;

        bmw.moveForward();

        bmw.stopMoving();

        System.out.println("*********************");

        Car audi= new Car();

        audi.make="Audi";
        audi.year=2023;
        audi.color="Black";
        audi.model="A5";

        audi.moveForward();
    }
}

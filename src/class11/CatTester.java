package class11;

public class CatTester {
    public static void main(String[] args) {
        //creating an object from the Cat class
        Cat omidsCat= new Cat();

        omidsCat.speak();
        omidsCat.name="Lego";
        omidsCat.breed="Van Cat";
        omidsCat.age=2;
        omidsCat.color="White";
        omidsCat.attitude=false;

        //let's create another cat

        Cat khatersCat= new Cat();

        khatersCat.name="Victoria";
        khatersCat.breed="Unknown";
        khatersCat.attitude=true;
        khatersCat.age=13;
        khatersCat.color="Black";
        khatersCat.eat();
    }

}

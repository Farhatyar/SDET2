package class16.AccessModifiers;

public class PersonTester {

    public static void main(String[] args) {

        Person person2=new Person();

        //System.out.println(person2.bankBalance); can't access cuz it's private
        System.out.println(person2.address); //works here but won't work if I move the class to another package
        System.out.println(person2.name);
        //person2.printPhonePassword(); can't access
        person2.printSSN(); //can access only in this package
        person2.printTiktokAcc();
    }
}

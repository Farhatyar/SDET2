package class16.instanceVsStatic2;

public class SyntaxEmployeeTester {
    /*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */

    public static void main(String[] args) {

        SyntaxEmployee asghar=new SyntaxEmployee();
        SyntaxEmployee asel=new SyntaxEmployee();

        asghar.empID=001;
        System.out.println(asghar.empID);
        asel.empID=002;
        System.out.println(asel.empID);


        asghar.salary=10000;
        System.out.println(asghar.salary);
        asel.salary=20000;
        System.out.println(asel.salary);

        System.out.println(asghar.ceo);
        System.out.println(asel.ceo);


    }
}

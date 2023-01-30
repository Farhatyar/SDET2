package class15.Methods3;

public class MPractice3Tester {

    /*
    create a method that takes an array of int
    sum all the elements from the array and return the sum
    */
    public static void main(String[] args) {

        MPractice3 obj=new MPractice3();

        int [] myArray={4,5,7,8,32,12,99};
        System.out.println(obj.sumAllElements(myArray));

        //or we can also store it in a variable

        int sumOfMyArrayElements= obj.sumAllElements(myArray);
        System.out.println(sumOfMyArrayElements);
    }
}

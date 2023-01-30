package class15.Methods3;

public class MPractice3 {

    /*
    create a method that takes an array of int
    sum all the elements from the array and return the sum
    */
    /*return type => int
    name of method =>arraySum
    parameters= int [] arr
     */

    int sumAllElements (int []arr){
        int sum=0;
        for (int number:arr){
            sum+=number;
        }
        System.out.print("Sum of all elements in the array is : ");
        return sum;
    }
}

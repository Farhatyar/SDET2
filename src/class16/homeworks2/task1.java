package class16.homeworks2;

public class task1 {

    /*
    Create a method that will accept an array as parameters
    and will return a sum of all elements from that array.
    Method should be visibly only within same package
    and accessible by the creating an instance of the class.
     */

    int sum (int []arr){
        int sum=0;
        for (int number:arr ){
            sum+=number;
        }
        return sum;
    }

    public static void main(String[] args) {

        task1 whateverObject=new task1(); //creating an instance or instantiating

        int [] array={1,2,3,4,5,6,7};
        System.out.println(whateverObject.sum(array));
    }
}

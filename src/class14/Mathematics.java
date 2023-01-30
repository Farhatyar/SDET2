package class14;

public class Mathematics {

    //write a method that takes 2 int numbers add them and show the results on console

    void addTwoNumbers(int num1, int num2){
        System.out.println(num1+num2);
    }

    void multiplyNumbers(int num1, int num2, int num3){
        System.out.println(num1+" multiplied by "+num2+" multiplied by "+num3+" equals to "+num1*num2*num3);
    }

    int subtract(int num1, int num2){
        //it tells java to return this value whenever subtract method is called
        return num1-num2;
    }

}

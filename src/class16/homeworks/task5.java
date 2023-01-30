package class16.homeworks;

public class task5 {

    String primeCheck(int a){
        boolean flag=true;
        for (int i = 2; i < a/2; i++) {
            if (a%i==0){
                flag=false;
                break;
            }
        }
        if (flag){
            return a+" is a prime number";
        }else {
            return a+" is not a prime number";
        }
    }
}

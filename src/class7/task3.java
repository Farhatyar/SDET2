package class7;

public class task3 {
    public static void main(String[] args) {
        /* program to print sum of all odd && even numbers (separately) from 0 to 100
         */

        int i;
        int sum=0;

        for (i=0; i<101; i++){
            if (i%2==0){
            sum+=i;
            }
        }
        System.out.println(sum);

    }
}

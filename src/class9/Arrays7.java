package class9;

public class Arrays7 {
    public static void main(String[] args) {
        // write a program that can tell us how many times the number 10.5 is present in array


        double [] arr= new double [6]; // an empty array of size 5 will be created

        arr[0]=10.5;
        arr[1]=12.0;
        arr[2]=45;
        arr[3]=10.5;
        arr[4]=23;
        arr[5]=10.5;

        int count_10Point5=0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]==10.5){
                count_10Point5++;
            }
        }
        System.out.println(count_10Point5);
    }
}

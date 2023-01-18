package class10;

public class ForEach3 {
    public static void main(String[] args) {

        // replace odd values with zero
        int [] arr= {10,13,20,25,45, 50};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==1){
                arr [i]=0;
            }
        }
        //if we use for each here, we won't be able to
        // assign 0 to odd values
    }
}

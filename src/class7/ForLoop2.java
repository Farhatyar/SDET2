package class7;

public class ForLoop2 {
    public static void main(String[] args) {

        for (int i=20; i>-1; i--){
            System.out.print(" "+i);
        }
        System.out.println();

        // prints even numbers
        for (int i=0; i<20; i++){
            if (i%2==0){
                System.out.print(" "+i);
            }
        }
        System.out.println();
        //prints odd number using this odd formula
        for (int i=1; i<20; i+=2){
            System.out.print(" "+i);
        }

    }
}

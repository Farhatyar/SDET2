package class8;

public class NestedLoops5 {
    public static void main(String[] args) {

        for (int row =0; row<3; row++){

            for (int col=0; col<5; col++){
                
                if (col==2 || col==1){
                    System.out.print(" ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}

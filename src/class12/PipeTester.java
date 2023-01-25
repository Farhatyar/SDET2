package class12;

public class PipeTester {
    public static void main(String[] args) {
        Pipe pvc=new Pipe();

        pvc.material="PVC";
        pvc.plastic=true;
        pvc.size="from 1/2 inch to 12 inch";
        pvc.cracks();

        System.out.println("*****************");

        Pipe abs= new Pipe();

        abs.material="ABS";
        abs.size="from 1/4 inch to 4 inch";
        abs.plastic=true;
        abs.cracks();
    }
}

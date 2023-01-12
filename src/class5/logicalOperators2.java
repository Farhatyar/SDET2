package class5;

public class logicalOperators2 {
    public static void main(String[] args) {

        //Not operator (!)
        System.out.println(!true);
        System.out.println(!false);
        boolean rich=true;
        System.out.println(rich);
        System.out.println(!rich);

        //Or operator (||)
        boolean flowers=true;
        boolean choco=false;

        if ( flowers || choco){
            System.out.println("Happy");
        }

        boolean wifi=true;
        boolean fiveG=false;

        if (wifi||fiveG){
            System.out.println("Internet usable");

        }else {
            System.out.println("No connectivity");
        }

        // And operator (&&)

        double math=92.5;
        double history=91.5;
        double geo=91;
        double bio=95;

        if (history >90 && math >90 && geo >90 && bio >90){
            System.out.println("You are a brilliant student");
        }else {
            System.out.println("You need to work harder");
        }
        }
    }


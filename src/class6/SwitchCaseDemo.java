package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="USA";

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){
            case "usa":
                System.out.println("You eat Burgers");
                break;
            case "italy":
                System.out.println("You eat Pizza");
                break;
            case "afghanistan":
                System.out.println("You eat Qabuli");
                break;
            case "germany":
                System.out.println("You eat Hotdogs");
                break;
            case "india":
                System.out.println("You eat Butter Chicken");
                break;
            default:
                System.out.println("Invalid Input");

        }// didn't like it - works only for lowercase - there should be a better way. I'm sure there is!


    }
}

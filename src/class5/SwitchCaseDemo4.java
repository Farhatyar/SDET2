package class5;

public class SwitchCaseDemo4 {
    public static void main(String[] args) {


        int day=1;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");
        }
//------------------------------------------------------------------------------------

        String subject="bio";
        switch (subject){
            case "maths":
                System.out.println("ok");
                break;
            case "bio":
                System.out.println("not ok");
                break;


            default:
                System.out.println("Unexpected value: " + subject);
        }
//------------------------------------------------------------------------------------
    }
}

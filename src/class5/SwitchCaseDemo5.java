package class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {
        
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
        String day="Friday";
        
        switch (day){
            
            case "Monday":
                System.out.println("Weekday");
                break;
            case "Tuesday":
                System.out.println("Weekday");
                break;
            case "Wednesday":
                System.out.println("Weekday");
                break;
            case "Thursday":
                System.out.println("Weekday");
                break;
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unexpected value: " + day);
        }
 /* ------------------------------------------------------------------------------------ */
        Scanner scan= new Scanner(System.in);
        System.out.print("Please enter your gender :M/m/F/f");
        char gender=scan.next().charAt(0);

        switch (gender){
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;

            default:
                System.out.println("Unexpected value: " + gender);
        }
        scan.close();
    }
}

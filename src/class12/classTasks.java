package class12;

import java.util.Scanner;

public class classTasks {
    public static void main(String[] args) {

        /*
        Store username, password and confirm password from a
        user and check following requirements:

        Username and Password cannot be  empty,
        if so→ message=”Username and Password cannot be empty”.

        Password should be minimum 8 characters,
        if less → message=”Password is too short”.

        Password cannot contain username
        if so, → message= " Password cannot contain username."

        Password should match confirmed password, if not
         → message=“Passwords do not match”.

        Only after all requirements met
        → message “Your username and password has been created”

         */

        Scanner scan = new Scanner(System.in);

        boolean flag=false;

        for (int i=1; i<5; i++) {
            System.out.println("Please enter your username: ");
            String username = scan.next();
            System.out.println("Please enter your password: ");
            String password = scan.next();
            System.out.println("Please confirm your password: ");
            String confirmPassword = scan.next();

            boolean usernameIsEmpty = username.isEmpty();
            boolean passwordIsEmpty = password.isEmpty();

            if (usernameIsEmpty || passwordIsEmpty) {
                System.out.println("Username and Password cannot be empty");

            } else if (password.length() < 8) {
                System.out.println("Password is too short");

            } else if (password.contains(username)) {
                System.out.println("Password cannot contain username");

            } else if (!password.equals(confirmPassword)) {
                System.out.println("Passwords do not match");

            } else {
                System.out.println("Your username and password has been created");
                break;

            }
            if (i==5){
                flag=true;
            }

        }

        if (flag) {
            System.out.println("Too many failed attempts!");
            System.out.println("Try again later");
        }
    }
}

package class15.Methods5;

public class inClassTaskTester {
    /*
    Create a method createEmail().
    Based on values of users name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail (John, Snow, gmail) → johnsnow@gmail.com
     */

    public static void main(String[] args) {

        inClassTask obj=new inClassTask();

        String emailAddress =obj.createEmail(
                "Omid",
                ".Waqf",
                "yahoo");

        System.out.println(emailAddress);

        String emailAddress2=obj.createEmail(
                "Aoblfazel",
                "Salaah",
                "gmail");

        System.out.println(emailAddress2);
    }
}

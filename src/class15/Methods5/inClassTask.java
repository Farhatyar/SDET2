package class15.Methods5;

public class inClassTask {
    /*
    Create a method createEmail().
    Based on values of users name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail (John, Snow, gmail) → johnsnow@gmail.com
     */

    String createEmail(String name, String lastName, String domain){
        return name.toLowerCase()
                +lastName.toLowerCase()
                +"@"+domain.toLowerCase()
                +".com";
    }
}

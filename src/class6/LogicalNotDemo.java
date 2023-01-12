package class6;

public class LogicalNotDemo {
    public static void main(String[] args) {
        String password="Pass123";

        if (!password.equals("Pass123")){
            System.out.println("Wrong password");
        }

        if (!password.equals("kashlfka")){
            System.out.println("Wrong password");
        }
    }
}

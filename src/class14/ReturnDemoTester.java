package class14;

public class ReturnDemoTester {
    public static void main(String[] args) {

        ReturnDemo rd=new ReturnDemo();

        String str=rd.method1();
        System.out.println(str);

        int number=rd.method2();
        System.out.println(number);
    }
}

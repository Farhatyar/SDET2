package class16.instanceVsStatic;

public class Student {
    String name;
    int roll_no;
    static String schoolName;
    int grade;
    char gender;

    void printName(){
        System.out.println(name);
        System.out.println(schoolName);
    }

    static void printInfo(){
        // System.out.println(name); can't access it here
        System.out.println(schoolName);
    }

}

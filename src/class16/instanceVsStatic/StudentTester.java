package class16.instanceVsStatic;

public class StudentTester {
    public static void main(String[] args) {
        Student student1=new Student();

        student1.name="Omid";
        student1.roll_no=1;
        student1.schoolName="Syntax";
        student1.grade=12;
        student1.gender='M';

        Student student2=new Student();

       // student2.name="Maryam";
        student2.roll_no=2;
       // student2.schoolName="Syntax";
        student2.grade=11;
        student2.gender='F';

        /*even though we haven't assigned any value for
        student2.schoolName but printing it shows Syntax
        because it is a static variable, and it's stored in the
        same memory location for all the objects
         */
        System.out.println(student2.schoolName);
        System.out.println(student2.name); // we get null
        System.out.println(Student.schoolName); //can call method for the class name cuz it's static
    }


}

package class16.instanceVsStatic3;

public class StudentTester {

    public static void main(String[] args) {
        /*
        Create three objects of the Students Class
        Set the value for  studentName , studentID and increment  the numberOfStudents for each object
        Print out  total number of students
         */

        Students student1=new Students();

        student1.name="Omid";
        student1.id="S001";
        student1.numberOfStudents++;

        Students student2=new Students();

        student2.name="Maryam";
        student2.id="S002";
        student2.numberOfStudents++;

        Students student3=new Students();

        student3.name="Tamim";
        student3.id="S003";
        student3.numberOfStudents++;

        System.out.println(Students.numberOfStudents);
    }
}

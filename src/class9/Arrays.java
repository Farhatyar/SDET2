package class9;

public class Arrays {
    public static void main(String[] args) {

        String [] studentsNames= {"Omid", "Khatera", "Tamim", "Maryam"};
        System.out.println(studentsNames[0]);
        System.out.println(studentsNames[3]);
        //System.out.println(studentsNames[5]);err bcz no name on index #5

        System.out.println("****************");


        for (int i=0; i<4; i++){
            System.out.println(studentsNames[i]);
        }
        System.out.println("****************");

        for (int i=0; i< studentsNames.length; i++){
            System.out.println(studentsNames[i]);
        }
    }
}

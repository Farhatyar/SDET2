package class10;

import java.util.Arrays;

public class D2Arrays2 {
    public static void main(String[] args) {

        // a 2D array which can hold 3 1D arrays
        //each of size 3

        String [][] thomsonTrain= new String[3][3];

        String[] cabin0= {"Adam","Zafar","Sam"};
        String[] cabin1= {"Nabi","Saud","Anees"};
        String[] cabin2= {"Safi","Abeera","Zahra"};


        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;

        //print examples
        System.out.println(thomsonTrain[1][0]);
        System.out.println(thomsonTrain[2][2]);

        System.out.println(Arrays.toString(thomsonTrain[0]));
    }
}

package class12;

public class StringDemo9 {
    public static void main(String[] args) {

        //how to check if the character is letter or num or symb
       String str="kjhkjh 342528824 %#%@@";

       int countAlph=0;
       for (int i=0; i<str.length(); i++){
           if (Character.isAlphabetic(str.charAt(i))){
               countAlph++;
           }
       }
        System.out.println("Total alphabets in Str is: "+countAlph);

       int countNumbers=0;
        for (int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                countNumbers++;
            }
        }
        System.out.println("Total numbers in Str is: "+countNumbers);
  }
}

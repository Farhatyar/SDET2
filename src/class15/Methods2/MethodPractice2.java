package class15.Methods2;

public class MethodPractice2 {
    // create a method that takes a String, reverse it and
    //return the reversed String
    //call the method reverseStr

    String reverseStr(String a){
        String newStr="";
        for (int i = a.length()-1; i >=0 ; i--) {
            newStr+=a.charAt(i);
        }
        return newStr;
    }

    String reverseStr1(String a){
        return new StringBuilder(a).reverse().toString();
    }
}

package class16.homeworks;

public class task4 {



    void helloInLanguage(String country){
            if (country.equalsIgnoreCase("usa")
                    ||country.equalsIgnoreCase("england")
                    ||country.equalsIgnoreCase("australia")
                    ||country.equalsIgnoreCase("uk")
            ){
                System.out.println( "Hello");
            } else if (country.equalsIgnoreCase("spain")
                ||country.equalsIgnoreCase("brazil")
                    ||country.equalsIgnoreCase("argentina")
                    ||country.equalsIgnoreCase("portugal")
            ){
                System.out.println( "Hola");
            }else if (country.equalsIgnoreCase("China")
                    ||country.equalsIgnoreCase("Taiwan")
            ){
                System.out.println( "Hello");
            }else if (country.equalsIgnoreCase("Afghanistan")
                    ||country.equalsIgnoreCase("Iran")
                    ||country.equalsIgnoreCase("Saudi Arabia")
                    ||country.equalsIgnoreCase("Kuwait")
            ){
                System.out.println( "Salam Alikum");
            }else if (country.equalsIgnoreCase("India")
            ){
                System.out.println("Namaste");
            }else {
                System.out.print("Country not known");
    }
    }
}

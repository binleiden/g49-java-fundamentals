package se.lexicon;

import org.w3c.dom.ls.LSOutput;

/**
 * Hello world!
 */
public class App {

    //single line comment.
    /*
    This is  a mulit-line comment
    */


    public static void main( String[] args )
    {
        //sout + tab
        System.out.println( "Hello World!" );

        short age = 25;
        short employeeExperience = 10;

        int productPrice = 5000;

        long balance  = 5000000000L;
        long totalPopulation = 70000000000L;

        char grade = 'A';

        boolean isStudent = true; // when using boolean use is in class name
        boolean isNotStudend = false;

        float radius = 5.5F; // F on the end for float

        double amount = 5000000.12313;



        String firstName = "Daniel";
        String lastName = "Petersson";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        int a=1, b = 2, c=3;
        System.out.println(a, b ,c);

    }

}

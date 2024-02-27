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


    public static void main( String[] args ) {
        //sout + tab
        System.out.println("Hello World!");
        //primitive variables 8 olika typer
        short age = 25;
        short employeeExperience = 10;

        int productPrice = 5000;

        long balance = 5000000000L;
        long totalPopulation = 70000000000L;

        char grade = 'A';

        boolean isStudent = true; // when using boolean use is in class name
        boolean isNotStudend = false;

        float radius = 5.5F; // F on the end for float

        double amount = 5000000.12313;


        //reference variable
        String firstName = "Daniel";
        String lastName = "Petersson";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        int a = 1, b = 2, c = 3;
        System.out.println();

        //operators

        int number1 = 5;
        int number2 = 10;

        number1 = number2;
        System.out.println(number1);
        System.out.println(number2);

        int sum = number1 + number2;
        System.out.println(sum);

        int num1 = 5;
        int num2 = 2;
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        int quotient = 10 / 5;
        int remainder = 20 % 5;

        System.out.println("quotioent is: " + quotient);
        System.out.println("remainder is: " + remainder);

        int n1 = 10, n2 = 9;
        boolean isEqual = n1 == n2; //Output false
        boolean isGreater = n1 > n2; //true
        boolean isNotEqual = n1 != n2; //true
        boolean isLessOrEqual = n2 <= n1; //true

        System.out.println(n1 == n2);

        int count = 5;
        System.out.println(++count);

      /*  int age2 = 30;
        if (age2 > 18);{
            System.out.println("have a beer");
        } else if (age2 < 18 && < 15); {
            System.out.println("have a beer and drive home");
        } else {
            System.out.println("to young");
        } */

        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednsday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }
        Person Daniel =  new Person(); // this is an object
        Daniel.firstName = "Daniel";
        Daniel.lastName = "Petersson";
        Daniel.age = 41;
        Daniel.hobby = "MTB";

        Person Klas =  new Person(); // this is an object
        Klas.firstName = "Klas";
        Klas.lastName = "Petersson";


        System.out.println(Daniel.firstName);
        System.out.println(Daniel.age);
        System.out.println(Klas.age); // 0
        System.out.println(Klas.hobby);//null

    }
}

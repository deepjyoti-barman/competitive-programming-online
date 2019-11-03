// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : August 28, 2018




// Problem: Demonstration of java.util.Scanner.hasNextInt() method.
// Solution:
import java.util.Scanner;

class DemoSecondary_hasNextInt
{
    public static void main(String[] args)
    {
        // Creating a new Scanner object and taking input from the user
        // The cursor will start to blink waiting for the user to give any input (as a token)
        System.out.println("Give a single input (integer / double / string):");
        Scanner sc = new Scanner(System.in);

        // Output of the following statements
        // If user inputs 4          - true, true, true
        // If user inputs 4.5        - false, true, true
        // If user inputs Deepjyoti  - false, false, true
        System.out.println("\nInteger input: " + sc.hasNextInt());
        System.out.println("Double input: " + sc.hasNextDouble());
        System.out.println("String input (whether there exists any input): " + sc.hasNext());

        // If an integer is passed as a token to Scanner object by the user
        if (sc.hasNextInt())
        {
            // Scan that token find for the integer and store it in intNum1
            int intNum1 = sc.nextInt();

            // As previously a single input was taken and there exists no more integer in the token
            // The cursor will start blinking again waiting for the user to give another input of same type
            // If the input is of same (integer) type, store it in intNum2; Else it will throw an exception
            System.out.print("\nGive another integer as input: ");
            int intNum2 = sc.nextInt();

            System.out.printf("\nIntegers are: %d and %d%n", intNum1, intNum2);
        }

        // If a double is passed as a token to Scanner object by the user
        else if (sc.hasNextDouble())
        {
            double doubleNum1 = sc.nextDouble();

            System.out.print("\nGive another double as input: ");
            double doubleNum2 = sc.nextDouble();

            System.out.printf("\nDoubles are: %f and %f%n", doubleNum1, doubleNum2);
        }

        // If a string (i.e. a sequence of characters) is passed as a token to Scanner object by the user
        else if (sc.hasNext())
        {
            String str1 = sc.next();

            System.out.print("\nGive another string as input: ");
            String str2 = sc.next();

            System.out.printf("\nStrings are: %s and %s%n", str1, str2);
        }

        // Close the Scanner object
        sc.close();
    }
}
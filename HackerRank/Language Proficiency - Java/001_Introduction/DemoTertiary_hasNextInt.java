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

class DemoTertiary_hasNextInt
{
    public static void main(String[] args)
    {
        // Give input: 4 14 17 147 1447 finish
        System.out.println("Enter one integer / integers separated by spaces (as token):");
        Scanner sc = new Scanner(System.in);

        // The moment there is no more int value to read loop will terminate
        while (sc.hasNextInt())
        {
            // Reads an int value
            int i = sc.nextInt();

            // Prints the int value
            System.out.println(i);
        }

        // Close the Scanner object
        sc.close();
    }
}
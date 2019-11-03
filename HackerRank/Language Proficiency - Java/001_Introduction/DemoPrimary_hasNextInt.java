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

class DemoPrimary_hasNextInt
{
    public static void main(String[] args)
    {
        String s = "Kolkata 2 Bangalore 4 Good";

        // Create a new Scanner object with the specified string
        Scanner sc = new Scanner(s);

        while (sc.hasNext())
        {
            // Check if Scanner's next token exists of not
            System.out.println(sc.hasNext());

            // Check if the Scanner's next token is an int
            System.out.println(sc.hasNextInt());

            // Print what is scanned
            System.out.println(sc.next() + "\n");
        }

        // Close the Scanner object
        sc.close();
    }
}
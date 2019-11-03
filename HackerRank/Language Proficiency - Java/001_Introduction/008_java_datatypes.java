// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : October 29, 2019




/* Problem: 
        - The first line contains an integer, T, denoting the number of test cases. 
        - Each test case, T, is comprised of a single line with an integer, n, which can be arbitrarily large or small.

        - For each input variable n and appropriate primitive dataType, you must determine if the given primitives are capable of storing it. If yes, then print:
            n can be fitted in:
                * dataType

        - If there is more than one appropriate data type, print each one on its own line and order them by size
            (i.e.:  byte < short < int < long).

        - If the number cannot be stored in one of the four aforementioned primitives, print the line:
            n can't be fitted anywhere.
*/
// Link: https://www.hackerrank.com/challenges/java-datatypes/problem
// Solution:
import java.util.Scanner;

class C001P008Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();

        for (int i = 0; i < term; i++)
        {
            try
            {
                // If the value is too big for a long variable to hold on it will throw an exception
                // The value itself will remain in InputStream (System.in) [Standard Input Stream (buffer)]
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");

                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short");

                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("* int");

                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                // sc.next() will retrieve the left-out value from InputStream
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        
        sc.close();
    }
}

// --- OR ---

/*
import java.util.Scanner;

class C001P008Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();

        for (int i = 0; i < term; i++)
        {
            try
            {
                // If the value is too big for a long variable to hold on it will throw an exception
                // The value itself will remain in InputStream (System.in) [Standard Input Stream (buffer)]
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if (x >= -Math.pow(2, 7) && x <= Math.pow(2, 7) - 1)
                    System.out.println("* byte");

                if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                    System.out.println("* short");

                if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                    System.out.println("* int");

                if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                // sc.next() will retrieve the left-out value from InputStream
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        
        sc.close();
    }
}
*/
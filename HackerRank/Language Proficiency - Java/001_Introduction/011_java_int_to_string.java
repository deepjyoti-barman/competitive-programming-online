// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : August 29, 2018




/* Problem: 
        - You are given an integer n, you have to convert it into a string.
        - If your code successfully converts n into a string s the code will print "Good job", otherwise it will print "Wrong answer".
        - n can range between -100 to 100 inclusive.
*/
// Link: https://www.hackerrank.com/challenges/java-int-to-string/problem
// Solution:
import java.util.Scanner;

class C001P011Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        sc.close();

        if (n >= -100 && n <= 100)
        {
            // Conversion of int into a string can be done in any one of the following ways:
            // String s = String.valueOf(n);
            // String s = Integer.toString(n);
            // String s = "" + n;
            Integer i = new Integer(n);     // Boxing int to Integer (non-primitive) type
            String s  = i.toString();

            System.out.println((n == Integer.parseInt(s)) ? "Good job" : "Wrong answer.");
        }
    }
}
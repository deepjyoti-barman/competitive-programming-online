// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : October 30, 2019




/* Problem: The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

        Given two strings of lowercase English letters, A and B, perform the following operations:
        1. Sum the lengths of A and B.
        2. Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
        3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
*/
// Link: https://www.hackerrank.com/challenges/java-strings-introduction/problem
// Solution:
import java.util.Scanner;

class C002P001Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // Finds sum of lengths of A and B
        System.out.println((A + B).length());

        // Determines if A is lexicographically larger than B
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        // [Algorithm-1]: Capitalizes the first letter in A and B and prints them
        System.out.print(A.substring(0, 1).toUpperCase() + A.substring(1) + " ");
        System.out.print(B.substring(0, 1).toUpperCase() + B.substring(1));

        sc.close();
    }
}

// --- OR ---

/* 
import java.util.Scanner;

class C002P001Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // Finds sum of lengths of A and B
        System.out.println(A.length() + B.length());

        // Determines if A is lexicographically larger than B
        if (A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    
        // [Algorithm-2]: Capitalizes the first letter in A and B and prints them
        System.out.print((char) (A.charAt(0) - 32) + A.substring(1) + " ");
        System.out.print((char) (B.charAt(0) - 32) + B.substring(1));

        sc.close();
    }
}
*/
// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : November 02, 2019




// Problem: Given a string A, print 'Yes' if it is a palindrome, print 'No' otherwise.
// Link: https://www.hackerrank.com/challenges/java-string-reverse/problem
// Solution:
import java.util.Scanner;

class C002P004Solution
{
    public static void main(String[] args)
    {
        Scanner sc       = new Scanner(System.in);
        String A         = sc.nextLine();
        String reversedA = new StringBuilder(A).reverse().toString();

        System.out.println(A.equalsIgnoreCase(reversedA) ? "Yes" : "No");

        sc.close();
    }
}

// --- OR ---

/*
import java.util.Scanner;

class C002P004Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String A   = sc.nextLine();
        
        int count = 0;
        for (int i = 0; i < A.length() / 2; i++)
        {
            if (A.charAt(i) == A.charAt(A.length() - 1 - i))
                count++;
        }

        System.out.println(count == A.length() / 2 ? "Yes" : "No");

        sc.close();
    }
}
*/

// --- OR ---

/*
import java.util.Scanner;

class C002P004Solution
{
    public static void main(String[] args)
    {
        Scanner sc        = new Scanner(System.in);
        String A          = sc.nextLine();
        char[] charArrayA = A.toCharArray();
        String reversedA  = "";

        // // [Algorithm-1]
        // for (int i = A.length() - 1; i >= 0; i--)
        //     reversedA = reversedA + charArrayA[i];
               
        // [Algorithm-2]
        for (int i = 0; i < charArrayA.length; i++)
            reversedA = charArrayA[i] + reversedA;
        
        System.out.println(A.equalsIgnoreCase(reversedA) ? "Yes" : "No");

        sc.close();
    }
}
*/

// --- OR ---

/*
import java.util.Scanner;

class C002P004Solution
{
    public static void main(String[] args)
    {
        Scanner sc       = new Scanner(System.in);
        String A         = sc.nextLine();
        String reversedA = "";

        for (int i = 0; i < A.length(); i++)
            reversedA = A.charAt(i) + reversedA;
        
        System.out.println(A.equalsIgnoreCase(reversedA) ? "Yes" : "No");

        sc.close();
    }
}
*/
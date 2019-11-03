// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : October 29, 2019




// Problem: You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
// Link: https://www.hackerrank.com/challenges/java-loops/problem
// Solution:
import java.util.Scanner;

class C001P007Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();

        for (int i = 0; i < term; i++)
        {
            int a   = sc.nextInt();
            int b   = sc.nextInt();
            int n   = sc.nextInt();
            int sum = 0;

            for (int count = 0; count < n; count++)
            {
                if (count == 0)
                {
                    int constant_term = a + (int) Math.pow(2, count) * b;
                    sum = sum + constant_term;
                }
                else
                    sum = sum + (int) Math.pow(2, count) * b;
                    
                System.out.print(sum + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}

// --- OR ---

/*
import java.util.Scanner;

class C001P007Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();

        for (int i = 0; i < term; i++)
        {
            int a        = sc.nextInt();
            int b        = sc.nextInt();
            int n        = sc.nextInt();
            int sum      = 0;
            int constant = (int) Math.pow(2, 0);

            for (int count = 0; count < n; count++)
            {
                if (count == 0)
                {
                    int first_term = a + constant * b;
                    sum = sum + first_term;
                }
                else
                {
                    constant = constant * 2;
                    sum = sum + constant * b;
                }
                    
                System.out.print(sum + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
*/
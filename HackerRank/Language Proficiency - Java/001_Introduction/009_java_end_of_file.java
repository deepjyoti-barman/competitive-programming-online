// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : September 04, 2018




/* Problem:
        - The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
        - Read some unknown n lines of input from stdin(System.in) until you reach EOF.
        - Each line of input contains a non-empty String.
        - For each line, print the line number, followed by a single space, and then the line content received as input.
*/
// Link: https://www.hackerrank.com/challenges/java-datatypes/problem
// Solution:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class C001P009Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int count = 0;

        while ((str = br.readLine()) != null)
            System.out.println(++count + " " + str);
        
        br.close();
    }
}

// --- OR ---

/*
import java.util.Scanner;

class C001P009Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (sc.hasNext())    
            System.out.println(++count + " " + sc.nextLine());

        sc.close();
    }
}
*/

// --- OR ---

/*
import java.util.Scanner;

class C001P009Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; sc.hasNext(); i++)
            System.out.println(i + " " + sc.nextLine());
        
        sc.close();
    }
}
*/
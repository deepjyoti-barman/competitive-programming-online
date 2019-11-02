// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : August 25, 2018




// Problem: In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line.
// Link: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
// Solution:
import java.util.Scanner;

class C001P002Solution
{
	public static void main(String[] args)
	{
		// Scanner Class – Easy, less typing, but very slow
		Scanner sc = new Scanner(System.in);

		// Reading all the inputs in the beginning
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		// Printing them all at the end
		System.out.println(a + "\n" + b + "\n" + c);
	}
}

// --- OR ---

/* 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class C001P002Solution
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader – Fast, but it requires lot of typing
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Reading all the inputs in the beginning
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();

		// Printing them all at the end
		System.out.println(a + "\n" + b + "\n" + c);
	}
}
*/

// --- OR ---

/* 
import java.util.Scanner;

class C001P002Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// Reading one input at a time and printing it
		for (int i = 0; i < 3; i++)
			System.out.println(sc.nextInt());

		sc.close();
	}
}
*/

// --- OR ---

/* 
import java.util.Scanner;

class C001P002Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// Java 8 Feature: Double colon operator (::) is used as shorthand for lambda expressions for calling a specific method
		// forEachRemaining() - Performs the given action for each remaining element until all elements have been processed or the action throws an exception
		// Reading one input at a time and printing it
		sc.forEachRemaining(System.out::println);

		sc.close();
	}
}
*/
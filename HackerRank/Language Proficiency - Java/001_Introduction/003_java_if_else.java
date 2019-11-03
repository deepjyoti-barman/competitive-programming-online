// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : August 26, 2018




/* Problem: Given an integer, n, perform the following conditional actions:
		a. If n is odd, print 'Weird'.
		b. If n is even and in the inclusive range of 2 to 5, print 'Not Weird'.
		c. If n is even and in the inclusive range of 6 to 20, print 'Weird'.
		d. If n is even and greater than 20, print 'Not Weird'.
		e. Constraint: 1 <= n <= 100.
*/
// Link: https://www.hackerrank.com/challenges/java-if-else/problem
// Solution:
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class C001P003Solution
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		// Explicitly mentioning all the conditions
		if ((n % 2 == 0) && ((n >= 2 && n <= 5) || n > 20))
			System.out.println("Not Weird");
		else
			System.out.println("Weird");
	}
}
*/

// --- OR ---

/* 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class C001P003Solution
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		// Explicitly mentioning all the conditions
		if ((n % 2 == 1) || ((n % 2 == 0) && (n >= 6 && n <= 20)))
			System.out.println("Weird");
		else
			System.out.println("Not Weird");
	}
}
*/

// --- OR ---

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class C001P003Solution
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		// Using optimized conditions
		// Previous condition: if ((n % 2 == 0) && ((n >= 2 && n <= 5) || n > 20))
		// Constraint: 1 <= n <= 100 [because of this constraint 0 and negatives won't be considered]
		// Hence replacing (n >= 2 && n <= 5) with (n < 6) isn't gong to make any changes to the outcome of this program
		if ((n % 2 == 0) && (n < 6 || n > 20))
			System.out.println("Not Weird");
		else
			System.out.println("Weird");
	}
}
*/

// --- OR ---

/* 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class C001P003Solution
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		// Using optimized conditions
		// Previous condition: if ((n % 2 == 1) || ((n % 2 == 0) && (n >= 6 && n <= 20)))
		// Removal of (n % 2 == 0) isn't going to make any changes to the outcome of this program
		if ((n % 2 == 1) || (n >= 6 && n <= 20))
			System.out.println("Weird");
		else
			System.out.println("Not Weird");
	}
}
*/

// --- OR ---

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class C001P003Solution
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		if (n % 2 == 1)
			System.out.println("Weird");
		// Replacing: (n >= 2 && n <= 5) by (n < 6)
        else if (n < 6)
			System.out.println("Not Weird");
		// Replacing: (n >= 6 && n <= 20) by (n < 21)
        else if (n < 21)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
	}
}

/*
Process to solve this problem: 
	a. Understand the conditions and write down the numbers involved in every cases.
	b. 1 to 100 all the numbers exists or not to identify 'Weird' or 'Not Weird' by a simple if-else block 
	   and not couple of if blocks with two different conditions.
	c. Proceed to make the elaborated one single complex condition.
	d. Finding all the numbers belonging to 'Weird' family;
	   Finding all the numbers belonging to 'Not weird' family.
	e. Proceed to optimize the previous condition.
*/
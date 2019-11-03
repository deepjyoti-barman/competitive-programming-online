// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : August 27, 2018




/* Problem: 
		There are three lines of input:
		a. The first line contains an integer.
		b. The second line contains a double.
		c. The third line contains a String.

		There are three lines of output:
		a. On the first line, print String: followed by the unaltered String read from stdin.
		b. On the second line, print Double: followed by the unaltered double read from stdin.
		c. On the third line, print Int: followed by the unaltered integer read from stdin.
*/
// Link: https://www.hackerrank.com/challenges/java-stdin-stdout/problem
// Solution:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class C001P004Solution
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int intNum        = Integer.parseInt(br.readLine());
		double doubleNum  = Double.parseDouble(br.readLine());
		String str        = br.readLine();
		br.close();

		System.out.println("String: " + str + "\nDouble: " + doubleNum + "\nInt: " + intNum);
	}
}

// --- OR ---

/*
import java.util.Scanner;

class C001P004Solution
{
	public static void main(String[] args)
	{
		Scanner sc       = new Scanner(System.in);
		int intNum       = sc.nextInt();
		double doubleNum = sc.nextDouble();
		sc.nextLine();			// Used to skip the left-out newline character in Standard Input Stream (buffer)
		String str       = sc.nextLine();
		sc.close();

		System.out.println("String: " + str + "\nDouble: " + doubleNum + "\nInt: " + intNum);
	}
}
*/

/*
NOTE:
-----
	- The next(), nextInt(), nextDouble() etc methods doesn't read left-out the newline character
	- The newline character is generated when you input a number or string and press enter ('\n')
	- The moment you issue command nextLine(), this method is able to read the input as well as the newline character
	- Hence it does not allow you to enter your next input returning a newline
	- To solve this issue use we used one extra 'sc.nextLine()' to skip the left-out newline character in Standard Input Stream (buffer)
*/


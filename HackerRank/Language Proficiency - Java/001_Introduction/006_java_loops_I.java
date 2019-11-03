// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : August 28, 2018




/* Problem: Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.
        [Constraint: 2 <= N <= 20]
*/
// Link: https://www.hackerrank.com/challenges/java-loops-i/problem
// Solution:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class C001P006Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d x %d = %d%n", N, i, N * i);
        }
    }
}
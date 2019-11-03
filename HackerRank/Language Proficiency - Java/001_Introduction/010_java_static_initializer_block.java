// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : October 29, 2019




/* Problem: 
        There are two lines of input. 
            - The first line contains B: the breadth of the parallelogram.
            - The next line contains H: the height of the parallelogram.

        If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
*/
// Link: https://www.hackerrank.com/challenges/java-static-initializer-block/problem
// Solution:
import java.util.Scanner;

class C001P010Solution
{
    static Scanner sc = new Scanner(System.in);
    static boolean flag = true;
    static int B;
    static int H;

    static
    {    
        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0)
        {
            try
            {   flag = false;
                throw new Exception("Breadth and height must be positive");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

        sc.close();
    }

    public static void main(String[] args)
    {
        if (flag)
        {
            int area = B * H;
            System.out.print(area);
        }
    }
}
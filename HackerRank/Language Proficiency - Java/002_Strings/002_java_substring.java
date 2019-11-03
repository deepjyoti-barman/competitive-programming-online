// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : October 31, 2019




// Problem: Given a string, s, and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end - 1.
// Link: https://www.hackerrank.com/challenges/java-substring/problem
// Solution:
import java.util.Scanner;

class C002P002Solution
{
    // Returns the substring from start to end
    public static String substr(String str, int start, int end)
    {
        return str.substring(start, end);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s   = sc.nextLine();
        int start  = sc.nextInt();
        int end    = sc.nextInt();

        String result = substr(s, start, end);
        System.out.println(result);

        sc.close(); 
    }
}
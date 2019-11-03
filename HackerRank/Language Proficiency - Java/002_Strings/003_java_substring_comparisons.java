// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : November 01, 2019




// Problem: Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.
// Link: https://www.hackerrank.com/challenges/java-string-compare/problem
// Solution:
import java.util.Scanner;

class C002P003Solution
{
    // Returns lexicographically smallest and largest substring of length 'k'
    public static String getSmallestAndLargest(String str, int k)
    {
        // Using TreeSet
        java.util.TreeSet<String> sortedSet = new java.util.TreeSet<String>();

        for (int i = 0; k <= str.length(); i++)
        {
            sortedSet.add(str.substring(i, k++));
        }

        String smallest = sortedSet.first();        
        String largest  = sortedSet.last();
        
        return smallest + "\n" + largest;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s     = scan.next();
        int k        = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

// --- OR ---

/*
import java.util.Scanner;

class C002P003Solution
{
    // Returns lexicographically smallest and largest substring of length 'k'
    public static String getSmallestAndLargest(String str, int k)
    {
        // Using ArrayList
        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        for (int i = 0; k <= str.length(); i++)
        {
            list.add(str.substring(i, k++));
        }

        // Sorting the collection
        java.util.Collections.sort(list);

        String smallest = list.get(0);
        String largest  = list.get(list.size() - 1);

        return smallest + "\n" + largest;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s     = scan.next();
        int k        = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
*/

// --- OR ---

/*
import java.util.Scanner;

class C002P003Solution
{
    // Returns lexicographically smallest and largest substring of length 'k'
    public static String getSmallestAndLargest(String str, int k)
    {
        String smallest = str.substring(0, k);
        String largest  = str.substring(0, k);
        k++;

        for (int i = 1; k <= str.length(); i++)
        {
            // If the new string is smaller than previously assumed smallest string, assign the new string to smallest
            if (str.substring(i, k).compareTo(smallest) < 0)
                smallest = str.substring(i, k);

            // If the new string is larger than previously assumed largest string, assign the new string to largest
            if (str.substring(i, k).compareTo(largest) > 0)
                largest = str.substring(i, k);
            
            k++;
        }
        
        return smallest + "\n" + largest;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s     = scan.next();
        int k        = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
*/
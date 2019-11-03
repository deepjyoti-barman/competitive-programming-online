// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : August 28, 2018




/* Problem: 
        Input format:
        a. Every line of input will contain a String followed by an integer. 
        b. Each String will have a maximum of 20 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

        Output format:
        - In each line of output there should be two columns: 
            a. The first column contains the String and is left justified using exactly 15 characters. 
            b. The second column contains the integer, expressed in exactly 3 digits.
        - If the original input has less than three digits, you must pad your output's leading digits with zeroes.
*/
// Link: https://www.hackerrank.com/challenges/java-output-formatting/problem
// Solution:
import java.util.Scanner;

class C001P005Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        
        for (int i = 0; i < 3; i++)
        {
            String str = sc.next();
            int intNum = sc.nextInt();
            /*
                %   : Used as a formatter.
                -   : Minus sign used for left indentation of the string.
                15s : Here 15 denotes the string's minimum field width 15.
                0   : Pads the extra 0s in the integer.
                3d  : 3 denotes integer's minimum field width 3.
                %n  : Prints the new line.
                More info @ https://www.cprogramming.com/tutorial/printf-format-strings.html
            */
            System.out.printf("%-15s%03d%n", str, intNum);
        }
        
        sc.close();
        System.out.println("================================");
    }
}
// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : October 29, 2019




/* Problem: You are given a date. You just need to write the method, getDay(), which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

        For example, if you are given the date August 14th 2017, the method should return MONDAY as the day on that date.
*/
// Link: https://www.hackerrank.com/challenges/java-date-and-time/problem
// Solution:
import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Result
{
    // Returns the day of the week on the given date
    public static String findDay(int month, int day, int year)
    {
        // Java 8 Feature: Date and Time API
        LocalDate ld = LocalDate.of(year, month, day);
        DayOfWeek dof = ld.getDayOfWeek();
        
        // [Process-1]
        // String dayOnDate = dof.name();
        
        // [Process-2]
        String dayOnDate = dof.getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
        
        return dayOnDate;
    }
}

class C001P012Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
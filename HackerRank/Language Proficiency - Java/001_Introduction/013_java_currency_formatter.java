// Platform       : HackerRank
// Course Section : Practice
// Course         : Language Proficiency
// Domain         : Java - https://www.hackerrank.com/domains/java
// Username       : defiant_dj04
// Author         : Deepjyoti Barman
// Date           : October 29, 2019




// Problem: Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class's getCurrencyInstance() method to convert payment into the US, Indian, Chinese, and French currency formats. Then print the formatted values.
// Link: https://www.hackerrank.com/challenges/java-currency-formatter/problem
// Solution:
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class C001P013Solution
{
    public static void main(String[] args)
    {
        // Read the inputs
        Scanner sc     = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        
        // Create custom Locale for India
        Locale indianLocale = new Locale("en", "IN");
        
        // Create NumberFormats using Locales of different countries
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indianLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        // Convert and print the payments in different currency formats according to each country
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
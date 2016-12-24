/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg21;

/**
 *
 * @author Russell
 */
public class Problem21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 0;
        int n = 1; 
        int end = 10000;
        while ( n < end)
        {
            if (isAmicable(n))
            {
                total += n;
                System.out.println(n);
            }
            n++;
        }
        System.out.println("Total: " + total);
    }
    public static boolean isAmicable(int n)
    {
        int sum = divisorSum(n);
        if (n == divisorSum(sum) && n != sum)
            return true;
        return false;
    }
    public static int divisorSum(int n)
    {
        int total = 0;
        int num = n;
        while (n > 1)
        {
            n--;
            if (isDivisor(num, n))
                total += n;
        }
        return total;
    }
    public static boolean isDivisor(int num, int div)
    {
        if ((num % div) == 0)
            return true;
        return false;
    }
}


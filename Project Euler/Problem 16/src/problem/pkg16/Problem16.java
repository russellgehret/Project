/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg16;

/**
 *
 * @author Russell
 */
public class Problem16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long n = 2;
        long x = 50;
        long a = exp(n, x);
        System.out.println(n + " to the " + x + " = " + a);
    }
    public static long exp(long n, long x)
    {
        long a = n;
        while (x > 1)
        {
            a = a * n;
            x--;
        }
        return a;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg3;

/**
 *
 * @author Russell
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static long NUMBER = 600851475143L;
    public static void main(String[] args) {
        long n = 1;
        long number = NUMBER;
        while (n < NUMBER/2)
        {
            n++;
            if (isPrimeFactor(n, number))
            {
                System.out.println(n);
            }
        }
    }
    public static boolean isPrimeFactor(long pf, long n)
    {
        if (((n % pf) == 0) && isPrime(pf))
            return true;
        return false;
    }
    
    public static boolean isPrime(long num)
    {
        for (int i = 2; i < num/2; i++)
        {
            if ((num % i) == 0)
                return false;
        }
        return true;    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg7;

/**
 *
 * @author Russell
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int counter = 0;
    long n = 1;
    while (counter < 10001)
    {
        n++;
        if (isPrime(n))
        {
            counter++;
            System.out.println(n);
        }
    }
    System.out.println(n);

    }
    public static boolean isPrime(long num)
    {
        for (int i = 2; i < num; i++)
        {
            if ((num % i) == 0)
                return false;
        }
        return true;    
    }
}

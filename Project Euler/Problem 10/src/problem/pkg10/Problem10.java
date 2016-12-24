/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg10;

/**
 *
 * @author Russell
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long total = 17;
        int num = 10;
        while (num < 2000000)
        {
            if(isPrime(num))
            {
                total += num;
                System.out.println(num  + "   " + total);
            }
            num ++;
        }
        System.out.println(total);
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

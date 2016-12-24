/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg14;

/**
 *
 * @author Russell
 */
public class Problem14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long n = 1;
        long largestSteps = 0;
        long largestNum = 0;
        long temp = 0;
        while (n < 1000000)
        {
            System.out.print(n + ": ");
            temp = collatz(n);
            if (temp > largestSteps)
            {
                largestSteps = temp;
                largestNum = n;
            }
            n++;
            System.out.println(largestSteps);
        }
        System.out.println(largestNum + "   " + largestSteps);
    }
public static long collatz(long num)  
{
    long counter = 1;
    while (num != 1)
    {
        if (num % 2 == 0)
            num = num / 2;
        else 
            num =  3 * num + 1;
        counter++;
    } 
    return counter;
}
//public static long step(int n)
    /*{
        if (n == 1)
            return 1;
        //System.out.print(n + "-> ");
        if (n % 2 == 0)
            n = n / 2;
        else 
            n =  3 * n + 1;
        return (1 + step(n));
    }*/
}

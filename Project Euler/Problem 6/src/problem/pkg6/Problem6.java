/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg6;

/**
 *
 * @author Russell
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;
        System.out.println(squareOfSum(n));
        System.out.println(sumOfSquares(n));
        System.out.println(squareOfSum(n)- sumOfSquares(n));
    }
    public static long squareOfSum (int n)
    {
        long sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum * sum;            
    }
    
    public static long sumOfSquares(int n)
    {
        long sum = 0;
        for (int i = 1; i <= n; i++)
            sum+= i * i;
        return sum;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg23;

/**
 *
 * @author Russell
 */
public class Problem23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int sum = 0;
        int upper = 28123;
        for (int j = 1; j < upper; j++)
        {
            //System.out.print(j + ": " + isAbundant(j));
            if (!isAbundantSum(j))
                sum += j;
            //System.out.println("     " + sum);
        }
        System.out.println("Sum is: " + sum);
    }

    
    public static boolean isAbundant(int n)
    {
        int total = 0;
        for(int i = 1; i < n; i++)
        {
            if (n % i == 0)
                total += i;
            if (total > n)
                return true;
        }
        
        return false;
    }
    
    public static boolean isAbundantSum(int n)
    {
        for (int k = 11; k <= n/2 + 1; k++)
        {
            for (int l = 11; l < n; l++)
            {
                if (k + l == n && isAbundant(k) && isAbundant(l))
                    return true;
            }
        }
        return false;
    }
    
}

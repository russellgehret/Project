/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg5;

/**
 *
 * @author Russell
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 20; 
        while (num < 1000000000)
        {
            if (isDivided(num))
                System.out.println(num);
            num++;
        }
    }
    
    public static boolean isDivided(int n)
    {
        for(int i = 2; i <= 20; i++)
            if ( n % i != 0)
                return false;
        return true;
    }
    
}

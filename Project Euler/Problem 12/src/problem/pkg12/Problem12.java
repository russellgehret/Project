/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg12;

/**
 *
 * @author Russell
 */
public class Problem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long num = 0;
        int totalDiv = 1;
        int i = 0;
        while (totalDiv <= 500)
        {            
            i++;
            num = calcTri(i);
            System.out.println(num +": ");
            totalDiv = 1;
            for (int j = 1; j <= num / 2;j++)
            {
                if(isDivisor(num, j))
                    totalDiv++;
            }
            System.out.println(totalDiv);
        }
    }
    public static long calcTri(int n)
    {
        long total = 0;
        for (int i = 1; i <=n; i++)
        {
            total += i;
        }
        return total;    
    }
    public static boolean isDivisor(long num, long div)
    {
        if ((num % div) == 0)
            return true;
        return false;
    }
}

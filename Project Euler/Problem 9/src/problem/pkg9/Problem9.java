/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg9;

/**
 *
 * @author Russell
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++)
            for (int j = 1; j < 1000; j++)
                for (int k = 1; k < 1000;k++)
                    if (isTriplet(i,j,k))
                        if (i + j + k == 1000)
                            System.out.println("A:" + i + " B:"+ j + " C:" +k + " ABC:" + i*j*k);
                
    }
    public static boolean isTriplet(int a, int b, int c)
    {
        if((a*a + b*b == c*c) && (a < b) && (b < c))
            return true;
        return false;
    }
}

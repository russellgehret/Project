/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg2;

/**
 *
 * @author Russell
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       long sum = 0;
       int temp = 0;
       int n = 1;
       int previous = 1;
       while (n < 4000000)
       {
           System .out.println(n);
           if ((n % 2)== 0)
               sum += n;
           temp = n;
           n += previous;
           previous = temp;    
        }
       System.out.println("The sum is: " + sum);
    }
    
}

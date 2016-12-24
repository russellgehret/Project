/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg1;

/**
 *
 * @author Russell
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n = 1;
    int counter = 0;
    int sum = 0;
    while (n < 1000)
    {
        System.out.print(n + ": ");
        if (((n % 3) == 0) && ((n % 5) == 0))
        {
            System.out.println("FizzBuzz");
            counter++;
            sum += n;
        }
        else if (((n % 3) == 0))
        {
            System.out.println("Fizz");
            counter++;
            sum += n;
        }
        else if ((n % 5) == 0)
        {
            System.out.println("Buzz");
            counter++;
            sum += n;
        }
        else 
        {
            System.out.println();
        }
        n++;
    }
    System.out.println("Number of multiples of 3 or 5: " + counter);
    System.out.println("Sum of multiples of 3 or 5: " + sum);
    }    
}

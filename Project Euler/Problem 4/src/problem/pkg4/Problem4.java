/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg4;

/**
 *
 * @author Russell
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int largest = 0;
        for (int i = 1; i < 1000; i++)
        {
            for (int j = 1; j < 1000; j++)
            {
                if (isPalindromic(i * j))
                {
                    System.out.println(i * j);
                    if (i*j > largest)
                        largest = i * j;
                }
            }
        }
        System.out.println("The largest is: " + largest);
    }
    public static boolean isPalindromic(int n)
    {
        int num = n;
        int digit = 0;
        int arr[] = new int[10];
        while ((num > 9))
        {
            arr[digit] = num % 10;
            num = num / 10;
            digit++;    
        }
        arr[digit] = num;
        int index = digit;
        int mid = digit / 2;
        int cnt = 0;
        while (index >= mid)
        {
            if(arr[index] != arr[cnt])
                return false;
            index--;
            cnt++;
        }
        return true;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg17;

/**
 *
 * @author Russell
 */
public class Problem17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num = 1001;
       String name = "";
       int total = 0;
       for (int i = 1; i < num; i++)
       {
           name = numToWord(i);
           System.out.println(name + " " + name.length());
           total += name.length();
       }
       System.out.println(total);
       
    }
    /*public static int numOfLetters(String num)
    {
        int n;
        n = num.length();
        return num.length();
    }*/
    public static String numToWord(int num)
    {
        String word = "";
        String a = "hundred";
        String b = "hundredand";
        String hun = "";
        String arr[] = new String[10];
        arr[0] = "";
        arr[1] = "one";
        arr[2] = "two";
        arr[3] = "three";
        arr[4] = "four";
        arr[5] = "five";
        arr[6] = "six";
        arr[7] = "seven";
        arr[8] = "eight";
        arr[9] = "nine";
        String arrTeen[] = new String[10];
        arrTeen[0] = "ten";
        arrTeen[1] = "eleven";
        arrTeen[2] = "twelve";
        arrTeen[3] = "thirteen";
        arrTeen[4] = "fourteen";
        arrTeen[5] = "fifteen";
        arrTeen[6] = "sixteen";
        arrTeen[7] = "seventeen";
        arrTeen[8] = "eighteen";
        arrTeen[9] = "nineteen";
        String arrTwenty[] = new String[10];
        arrTwenty[0] = "";
        arrTwenty[1] = "";
        arrTwenty[2] = "twenty";
        arrTwenty[3] = "thirty";
        arrTwenty[4] = "forty";
        arrTwenty[5] = "fifty";
        arrTwenty[6] = "sixty";
        arrTwenty[7] = "seventy";
        arrTwenty[8] = "eighty";
        arrTwenty[9] = "ninety";
        
        if (num < 10)
            word = arr[num];
        else if (num < 20)
            word = arrTeen[num % 10];
        else if (num < 100)
            word = arrTwenty[num/10] + arr[num % 10];
        else if (num < 1000)
        {
            if (num/10 % 10 == 0 && num % 10 == 0)
                hun = a;
            else
                hun = b;
            if ((num/10) % 10 == 1)
                word = arr[num/100] + hun + arrTeen[num % 10];
            else
                word = arr[num/100] + hun + arrTwenty[num/10 % 10] + arr[num % 10];
        }
        else
            word = "onethousand";
        return word;
    }
}

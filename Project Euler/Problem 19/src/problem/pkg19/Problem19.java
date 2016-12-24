/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg19;

/**
 *
 * @author Russell
 */
public class Problem19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month[] = new int[13];
        month[1] = 31;
        month[2] = 28;
        month[3] = 31;
        month[4] = 30;
        month[5] = 31;
        month[6] = 30;
        month[7] = 31;
        month[8] = 31;
        month[9] = 30;
        month[10] = 31;
        month[11] = 30;
        month[12] = 31;  
        int dayOfWeek = 2;
        int year = 1900;
        int monthOfYear = 1;
        int dayOfMonth = 1;
        int counter = 0;
        int m = 0;
        while (year <= 2000)
        {
            m = month[monthOfYear];
            if (monthOfYear == 2 && isLeap(year))
                m++;
            while (m > 0)
            {
                dayOfMonth++;
                dayOfWeek++;
                if (dayOfWeek == 8)
                    dayOfWeek = 1;
                System.out.println(monthOfYear + " / " + dayOfMonth + " / " + year + "   " + dayOfWeek);
                m--;
            }
            dayOfMonth = 1; 
            if (dayOfMonth == 1 && dayOfWeek == 1)
            {
                System.out.println("*************************");
                counter++; 
            }
            if (monthOfYear == 12)
            {
                monthOfYear = 0;
                year++;
            }
            monthOfYear++;
        }
        System.out.println(counter);
    }
    public static boolean isLeap(int year)
    {
        if (year % 4 == 0)
            if (year % 100 != 0 || year % 400 == 0)
                return true;
        return false;            
    }
}

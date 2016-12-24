/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg8;

/**
 *
 * @author Russell
 */
import java.io.*;
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = "Problem8.txt";
        String line = "";
        int n = 1;
        int index = 0;
        int largest = 0;
        int total = 1;
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            char[] arr = line.toCharArray();
            while (index < 1000)
            {
                System.out.println(largest);
                n = Character.getNumericValue(arr[index]);
                if (index < 10)
                    total *= n;
                else 
                {
                    total = total * n/ Character.getNumericValue(arr[index - 10]);
                }
                if (total > largest)
                    largest = total;
                index++;
            }
            System.out.println(largest);
            bufferedReader.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
        catch(IOException ex){
            System.out.println("Error");
        }
    }
    
}

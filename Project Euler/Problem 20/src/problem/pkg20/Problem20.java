/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg20;

/**
 *
 * @author Russell
 */
import java.math.BigInteger;
public class Problem20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger fact = new BigInteger("1");
        BigInteger num = new BigInteger("100");
        BigInteger nOne= new BigInteger("-1");
        int n = 100;
        while (n > 0)
        {
            fact = fact.multiply(num);
            num = num.add(nOne);
            n--;
        }
        System.out.println(fact);
        System.out.println(digitSum(fact));
    }
    public static BigInteger digitSum(BigInteger num)
    {
        BigInteger ten= new BigInteger("10");
        BigInteger zero= new BigInteger("0");
        BigInteger total= new BigInteger("0");
        while(!num.equals(zero))
        {
            total = total.add(num.mod(ten));
            num = num.divide(ten);
        }
        return total;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bignumber;

import java.math.BigInteger;

/**
 *
 * @author intel
 */
public class BigNumber {

    /**
     * @param args the command line arguments
     */
      static void show(){
        String s="100000000000000000000000000000000000000000";
        String s1="10000000000000000000000000000000000000000";
        BigInteger num1=new BigInteger(s);
        BigInteger num2 =new BigInteger(s1);
        BigInteger Mul;
        Mul=num1.multiply(num2);
        System.out.println("mul="+Mul);
       // return show();
    }
     static void show1()
     {
           BigInteger fact=new BigInteger("0");
           BigInteger i= new BigInteger("1");
        {
             
         }
     }
    public static void main(String[] args) {
        // TODO code application logic here
       show();
}
}

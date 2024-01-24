/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumber;


public class PrimeNumber {

   static boolean primecheck(int a)
   {
       int count=0;
       for(int i=1;i<a/2;i++)
       {
           if(a%i==0)
               count++;
           
       }
       if(count>1)
           return false;
       else
           return true;
   }
    public static void main(String[] args) {
        System.out.println(primecheck(15));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gcd_hcf;

public class GCD_HCF {
    static int GDC(int a,int b)
    {
        int f=0,i=1;
        while(i<=a)
        {
            if(a%i==0&&b%i==0)
                f=i;
            i++;
        }
        return f;
    }
   
    public static void main(String[] args) {
        System.out.println(GDC(35,56));
    }
    
}

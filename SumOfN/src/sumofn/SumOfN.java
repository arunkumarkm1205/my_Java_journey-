/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofn;

import java.util.Scanner;
public class SumOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the N ");
        long n=sc.nextLong();
        long S=0;
        for(int i=1;i<=n;i++)
        {
            S+=i;
            
        }
        System.out.println("sum is: "+ S);
    }
    
}

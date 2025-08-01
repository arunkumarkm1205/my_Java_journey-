/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gp;

import java.util.Scanner;


public class GP {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number and Common ratio and number of terms");
        long a,r,t;
        a=sc.nextLong();
        r=sc.nextLong();
        t=sc.nextLong();
        for(long i=0, k=0;i<t;i++)
        {
            
            k=(int) (a*Math.pow(r, i));
            System.out.println(k);
        }
    }
    
}

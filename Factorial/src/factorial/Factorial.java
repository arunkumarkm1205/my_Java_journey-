/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;


public class Factorial {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the N ");
        long n=sc.nextLong();
        long S=1;
        for(int i=1;i<=n;i++)
        {
            S=i*S;
            
        }
        System.out.println("factorial is: "+ S);
    }
    
}

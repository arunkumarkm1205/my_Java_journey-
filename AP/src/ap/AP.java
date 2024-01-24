/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap;

import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number and Common Difference and number of terms");
        int a,d,t;
        a=sc.nextInt();
        d=sc.nextInt();
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println(a);
            a+=d;
        }
    }
    
}

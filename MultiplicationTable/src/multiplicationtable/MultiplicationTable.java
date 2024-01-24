/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicationtable;

import java.lang.*;
import java.util.Scanner;
public class MultiplicationTable {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the N ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
          System.out.println(n + " X " + i + " = " + (i*n)  );
    }
    
}

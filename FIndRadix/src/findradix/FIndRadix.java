/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findradix;

import java.lang.*;
import java.util.Scanner;

public class FIndRadix 
{    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String num;
        System.out.println("Enter the the number");
        num=sc.nextLine();
        if(num.matches("[0-1]+"))
            System.out.println("Binary Number Radix 2 ");
        else if(num.matches("[0-7]+"))
            System.out.println("Octal Number Radix 8");
        else if(num.matches("[0-9]+"))
            System.out.println("Decimal Number Radix 10 ");
        else if(num.matches("[0-9A-F]+"))
            System.out.println("Hexa Decimal Number Radix 16");
        else 
            System.out.println("Invalid Number");
        
       
    }
    
}

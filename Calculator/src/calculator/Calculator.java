/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.lang.*;
import static java.lang.System.exit;
import java.util.Scanner;

public class Calculator {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a,b;
        int choice=0;
         System.out.println("""
                           
                           1.ADDITION
                           2.SUBTRACTION
                           3.MULTIPLICATION
                           4.DIVISION""");
        System.out.println("SELECT YOUR OPERATION");
        choice=sc.nextInt();
        System.out.println("Enter valu of A and B");
        a=sc.nextFloat();
        b=sc.nextFloat();
       
        switch(choice)
        {
            case 1:System.out.println("Sum is "+(a+b));
                   break;
            case 2:System.out.println("defference is "+(a-b));      
                   break;
            case 3:System.out.println("the product is "+(a*b));
                   break;
            case 4:if(b==0)
                      {System.out.println("cant divide by zero");
                        exit(0);
                      }
                   else
                      {
                          System.out.println("the divsion is "+(a/b));
                          break;
                      }  
            default:System.out.println("Invalid choice");
                     break;
        }              
    }
}

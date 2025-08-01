/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displaynumbersinwords;

import java.util.Scanner;

/**
 *
 * @author arunk
 */
public class DisplayNumbersInWords {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       int n,m,k,c=0,s=0;
        System.out.print("Enter the number:");
        n=sc.nextInt();
        m=k=n;
        while(k!=0)
        {
            k=k/10;
            c++;
        }
        int g=c-1;
        for(int i=0;i<c;i++)
        {
            int l=m%10;
            m=m/10;
            s+=l*Math.pow(10, g--);
        }
        for(int i=0;i<c;i++)
        {
            int r=s%10;
            s=s/10;
            switch(r)
            {
                case 1 -> System.out.print(" one");
                case 2 -> System.out.print(" two");
                case 3 -> System.out.print(" three");
                case 4 -> System.out.print(" four");
                case 5 -> System.out.print(" five");
                case 6 -> System.out.print(" six");
                case 7 -> System.out.print(" seven");
                case 8 -> System.out.print(" eight");
                case 9 -> System.out.print(" nine");
                default -> System.out.print(" zero");
            }
            
        }
       System.out.println("");  
      
    }
}
    
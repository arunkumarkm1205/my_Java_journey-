/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grader;
import java.lang.*;
import java.util.Scanner;
public class Grader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n=3;
       System.out.println("Enter subject marks:");
        int M1=sc.nextInt();
        int M2=sc.nextInt();
        int M3=sc.nextInt();
        float G;
        G = (float)((M3+M1+M2)/n);
        System.out.println(G);
        if(G>90.0)
            System.out.println("Grade A");
        else if(G>80.0&&G<90.0)
            System.out.println("Grade B");
        else if(G>70.0&&G<80.0)
            System.out.println("Grade C");
        else if(G>60.0&&G<70.0)
            System.out.println("Grade D");
        else if(G<60.0)
            System.out.println("Grade P");
        else 
            System.out.println("invalid marks ");
    }
    
    
}

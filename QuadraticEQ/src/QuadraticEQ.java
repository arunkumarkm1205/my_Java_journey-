/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class QuadraticEQ
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=1,b=3,c=1;
        float D=0,r1=0,r2 = 0;
//        System.out.println("enter the a b c:");
//        a=sc.nextInt();
//        b=sc.nextInt();
//        c=sc.nextInt();
        D=(float)Math.sqrt((b*b)-(4*a*c));
        r1=(-b+D)/2*a;
        r2=(-b-D)/2*a;
        System.out.print("the roots are "+r1+" "+r2);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaoftrianle;

/**
 *
 * @author arunk
 */
import java.lang.*;
import java.util.Scanner;
public class AreaOfTrianle {
    public static void main(String[] args)
    {
        int a,b,c;
        float s;
        float area;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("enter  3 sides triangle:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(c+a+b)/2f;
        area=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("the area of the traingle: "+area);
       
    }
    
}

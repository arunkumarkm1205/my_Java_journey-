/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;


class rectangle{
    public double l;
    public double b;
    
    public double area(){
        return l*b;
        
    }
    public double peri(){
        return 2*(l+b);
    }
    public boolean isSquare(){
        return b==l;
    }
}
class Cylinder{
    public double r;
    public double h;
    
    public double lidArea(){
        return Math.PI*r*r;
    }
    public double TotalSurfaceArea(){
        return (Math.PI*r*r*2)+(Math.PI*2*r*h);
    }
    public double volume(){
        return Math.PI*r*r*h;
    }
    
}
    

public class Shape {

    
    public static void main(String[] args) {
       rectangle r1=new rectangle();
       Cylinder c1=new Cylinder();
       c1.h=7;
       c1.r=12;
       r1.l=12;
       r1.b=12;
        System.out.format("Area is :%.2f",r1.area());
        System.out.format("\nPerimeter is :%.2f",r1.peri());
        System.out.println("\nit is a SQAURE "+r1.isSquare());
        System.out.format("\nLid Area of cylinder %.2f",c1.lidArea());
        System.out.format("\ntotal Surface area is %.2f",c1.TotalSurfaceArea());
        System.out.format("\nthe cylinder voliume is %.2f:",c1.volume());
    }
    
}

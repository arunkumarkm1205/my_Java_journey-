/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractclass;
abstract class Shape{
    abstract double area();
    abstract double perimeter();
}
class Rectangle extends Shape{
    public double length;
    public double breadth;
    
    public Rectangle(double l, double b ){
        length=l;
        breadth=b;
    }
    @Override
    public double area(){
        return length*breadth;
    }
    @Override
    public double perimeter(){
        return ((length+breadth)*2);
    }
        
}
class Circle extends Shape{
    public double redius;
    
    public Circle(double r){
         redius =r;
    }
    @Override
    public double area(){
        return Math.PI*redius*redius;
    }
    
    @Override
    public double perimeter(){
        return Math.PI*2*redius;
    }
}
    

public class AbstractClass {

   
    public static void main(String[] args) {
        Shape r1,c1;
        r1= new Rectangle(10,20);
        c1=new Circle(7);
        System.out.println("Area of the circle "+c1.area());
        System.out.println("Area of rectangle "+r1.area());
        System.out.println("perimeter of circle "+c1.perimeter());
        System.out.println("perimeter of rectangle "+r1.perimeter());
        
    }
    
}

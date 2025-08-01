/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method_overriding;
class Car
{
    public void poweron(){
        System.out.println("car started");
    }
    public void poweroff(){
        System.out.println("car stopped");
    }
}
class Super_car extends Car{
     @Override
     public void poweron(){
        System.out.println(" super car started");
    }
     @Override
    public void poweroff(){
        System.out.println("super car stopped");
    }
}


public class Method_Overriding {

   
    public static void main(String[] args) {
       Car c1=new Super_car();
        c1.poweron();
        c1.poweroff();
    }
    
}

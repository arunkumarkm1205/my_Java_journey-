/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asynchronous_innerclass;
abstract class my{
    abstract void display();
}
class Outer{
    public void display(){
        my m=new my(){
            @Override
            public void display(){
                System.out.println("hello");
            }    
        };
        m.display();
    }    
}
    

public class Asynchronous_innerclass {

   
    public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
    }
    
}

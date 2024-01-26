/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package static_innerclass;

class Outer{
    int x=10;
    static int y=20;
    static class my{
        public void show(){
            System.out.println(y);
        }
            
    }
}
public class Static_innerclass {

   
    public static void main(String[] args) {
       Outer.my m=new Outer.my();
       m.show();
    }
    
}

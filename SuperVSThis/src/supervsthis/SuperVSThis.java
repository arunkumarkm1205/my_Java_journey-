/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supervsthis;
class rect{
    public int length;
    public int breadth;
    public int x=10;
    public rect(int length,int breadth){
        this.length=length;
        this.breadth=breadth;   
    }
    public int area(){
       return length*breadth;
    }     
}
class cube extends rect
{
      public int hiegth;
      public int x=20;

        public cube(int l,int b,int h)
         {
          super(l,b);
           this.hiegth=h;
         }
        public int volume(){
            
             System.out.println(super.x);
             return area()*hiegth;
        }
}
public class SuperVSThis {
    public static void main(String[] args) {
       cube c1=new cube(7,5,9);
        System.out.println(c1.volume());
        System.out.println(c1.x);
       
    }
    
}

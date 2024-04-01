/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication69;

/**
 *
 * @author arunk
 */
interface Area{
    
   float compute(float k , float l);
}
interface b{
   int B=2;
   public int bc();
}
class  Circle implements Area,b
{
    @Override
    public float compute(float k,float l){
        return k*l;
    }
    @Override
    public int bc(){
        System.out.println(B);
        return 0;
    }
        
}

public class JavaApplication69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String S1="hEllo world";
       String s2=S1.trim();
        System.out.println(S1+" " +s2);
        String  k=String.valueOf(11);
        System.out.println(k);
        Circle c1=new Circle();
        Area area;
        area=c1;
        System.out.println(area.compute(10, 20));
        System.out.println(c1.compute(10, 10));
    }
    
}

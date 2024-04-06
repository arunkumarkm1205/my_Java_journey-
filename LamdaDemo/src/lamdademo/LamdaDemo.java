/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lamdademo;

/**
 *
 * @author arunk
 */
interface Mylamda
{
    public void display(String s1);
}
interface Maths
{
    public int add(int i,int k);
}
public class LamdaDemo {
    public LamdaDemo(String s) {
        System.out.println(s);
    }

    public static void show(String s1)
    {
        System.out.println(s1+" constructor");
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        Mylamda m1=LamdaDemo::show;
        Mylamda m2=System.out::println;
        Mylamda m3=LamdaDemo::new;
        Maths m4=(j,k)->j+k;
        m1.display("hello world");
        m2.display("this is java ");
        m3.display("from");
        System.out.println(m4.add(5, 6));
    }
    
}

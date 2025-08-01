/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package neasted_innerclass;

class Outer{
    int x=10;
    class Inner{
        int y=18;
        public void Innerdisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    public void outerdisplay(){
        Inner i=new Inner();
        i.Innerdisplay();
        System.out.println(i.y);
    }
}
public class Neasted_innerclass {
    public static void main(String[] args) {
        Outer out=new Outer();
        out.outerdisplay();
    }
}

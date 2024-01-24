/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areas;


public class Areas {
 static int area(int l,int b)
 {
     return l*b;
 }
 static float area(int r)
 {
     return (float) (Math.PI*r*r);
 }
    
    public static void main(String[] args) {
        System.out.println(area(12));
    }
    
}

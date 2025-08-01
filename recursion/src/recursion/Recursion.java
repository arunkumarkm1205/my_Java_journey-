/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;

public class Recursion {

    static void fun(int n)
    {
        if(n>0)
        {      System.out.print(n);
               fun(n-1);
               System.out.print(n);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=3;
        fun(n);
    }
    
}

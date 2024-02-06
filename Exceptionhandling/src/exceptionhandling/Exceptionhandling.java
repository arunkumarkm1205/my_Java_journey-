/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author arunk
 */
public class Exceptionhandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=10 ,b=0;
        try{ int s=a/b;
            
        }
        catch(ArithmeticException e){
            System.out.println("zero error");
        }
    }
    
}

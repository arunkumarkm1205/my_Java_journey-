/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitwiseapplication;


public class BitwiseApplication {

    
    public static void main(String[] args) 
    {
        byte a=5,b=6,c;
        c=(byte)(a<<4);
        c=(byte)(c|b);
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package static_blocks;

class Test{
    
}
public class Static_Blocks {
    static 
     {
        System.out.println("block 1");
      }
    static {
        System.out.println("block 2");
    }
    public static void main(String[] args) {
      
        System.out.println("hello main");
    }
    
}

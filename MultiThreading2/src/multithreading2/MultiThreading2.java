/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading2;


public class MultiThreading2 extends Thread
{
      @Override
      public void run(){
          int i=0;
          while(true){
              System.out.println("\t"+i++ + " hello");
          }
      }
    
    public static void main(String[] args) {
        MultiThreading2 t= new MultiThreading2();
        t.start();
        int i=0;
          while(true){
              System.out.println(i++ + " world");
          }
    }
    
}

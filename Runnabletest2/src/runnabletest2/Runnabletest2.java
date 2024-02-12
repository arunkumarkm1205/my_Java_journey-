/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runnabletest2;


public class Runnabletest2 implements Runnable
{
    public void run()
    {
        int i=0;
         while(true)
         {
                     System.out.println(i++ + "hello");
         }
}
              
    
    public static void main(String[] args) {
        Runnabletest2 m=new Runnabletest2();
        Thread t=new Thread(m);
        t.start();
        int i=0;
        while(true){
            System.out.println(i++ + "World");
        }
    }
    
}

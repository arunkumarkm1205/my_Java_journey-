/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runnabletest;

class MyRunnablle implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(true){
            System.out.println(i++ + "hello");
        }
    }
        
}
    
public class Runnabletest {

    
    public static void main(String[] args) {
      MyRunnablle m= new MyRunnablle();
      Thread t = new Thread(m);
      t.start();
      int i=0;
        while(true){
            System.out.println(i++ + "hello");
        }
    }
    
}

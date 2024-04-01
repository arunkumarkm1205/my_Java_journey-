/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yield;

class MyThread extends Thread{
    @Override
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++ + " my thread 1");
        }
    }
}
public class Yield {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        int count=1;
        while(true){
            System.out.println(count++ + " main");
            Thread.yield();
        }
    }
}

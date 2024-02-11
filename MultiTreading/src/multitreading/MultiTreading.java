/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multitreading;

class Mythread extends Thread{
    @Override
    public void run(){
        int i=0;
        while(true){
            System.out.println(i+"hello");
            i++;
        }
            
    }
        
}
public class MultiTreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mythread t=new Mythread();
        t.start();
        int i=0;
        while(true){
            System.out.println("\t"+i+"world");
            
            i++;
        }
    }
    
}

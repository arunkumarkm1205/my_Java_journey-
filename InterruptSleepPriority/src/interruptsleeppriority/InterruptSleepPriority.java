/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interruptsleeppriority;
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        setPriority(Thread.MIN_PRIORITY+2);
    }
    @Override
    public void run()
    {
        int count=1;
        while(true){
            System.out.println(count++);
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
        
}

public class InterruptSleepPriority {

    
    public static void main(String[] args) throws Exception
    {
        MyThread t=new MyThread("My thread 1");
        t.start();
//        t.interrupt();
    }
    
}

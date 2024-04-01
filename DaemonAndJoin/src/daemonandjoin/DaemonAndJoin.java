/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daemonandjoin;

class MyThread extends Thread
{
    public MyThread(String n){
        super(n);
    }
    @Override
    public void run()
    {
       int count=1;
        while(true)
        {
            System.out.println(count++);
        }
    }
}
public class DaemonAndJoin 
{

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception
    {
        MyThread t=new MyThread("my thread 1");
       t.setDaemon(true);
        t.start();
      Thread MainThread=Thread.currentThread();  
      MainThread.join();
    }
    
}

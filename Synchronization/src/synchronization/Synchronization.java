/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package synchronization;

class Mydata
{
    synchronized public void display(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}
class MyThread1 extends Thread
{
    Mydata d;
     public MyThread1(Mydata dat)
    {
        this.d=dat;
    }
    @Override
     public void run()
     {
         d.display(" hello world ");
     }
        
}
class MyThread2 extends Thread
{
    Mydata d;
     public MyThread2(Mydata dat)
    {
        this.d=dat;
    }
    @Override
     public void run()
     {
         d.display(" welcome all ");
     }
        
}
    
public class Synchronization 
{

    
    public static void main(String[] args) 
    {
       Mydata data=new Mydata();
       
       MyThread1 t1=new MyThread1(data);
       MyThread2 t2=new MyThread2(data);
       
       t1.start();
       t2.start();
       
    }
}

    


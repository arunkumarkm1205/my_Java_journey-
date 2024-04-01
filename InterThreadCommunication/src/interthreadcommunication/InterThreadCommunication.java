/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interthreadcommunication;
class Mydata
{
    int value=0;
    boolean flag=true;
    synchronized public void set(int v)
    {
        while(flag!=true)
           try{ wait();}catch(Exception E){}
        value=v;
        flag=false;
        notify();
    }
    synchronized public int get()
    {
        while(flag!=false)
           try{ wait();}catch(Exception E){}
             
        flag=true;
        notify();
        return value;
    }
        
}
class Produce extends Thread
{
    Mydata m;
    public Produce(Mydata dat)
    {
        m=dat;
    }
    @Override
    public void run()
    {
        int i=0;
        while(true)
        {
            m.set(i);
            System.out.println("produce "+i++);
        }
            
    }
}
class Consume extends Thread
{
    Mydata m;
    public Consume(Mydata dat)
    {
        m=dat;
    }
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Consume "+m.get());
        } 
    }
}
    
    
public class InterThreadCommunication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mydata d=new Mydata();
        Produce p1=new Produce(d);
        Consume c1=new Consume(d);
        p1.start();
        c1.start();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmproblemonsync;

/**
 *
 * @author arunk
 */
class ATM 
{
  synchronized public void checkBalance(String n)
    {
        System.out.println("Mr."+n+" account balance is 10,000");
        try{Thread.sleep(1000);}catch(InterruptedException e){}
    }
    synchronized public void Withdraw(String n,int A)
    {
        System.out.println("Mr."+n+" collect your money "+A);
        try{Thread.sleep(1000);}catch(InterruptedException e){}
    }
    
}
class User extends Thread
{
    ATM m;
    String Name;
    int a;
    public User(ATM k,String N,int j)
    {
        m=k;
        Name=N;
        a=j;
    }
    @Override
    public void run()
    {
        m.checkBalance(Name);
        m.Withdraw(Name, a);
    }
        
}
public class ATMproblemOnSync {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ATM h=new ATM();
        User u1=new User(h,"arun",2000);
        User u2=new User(h,"karun",5000);
        u1.start();
        u2.start();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @version 1.0
 * @since 2024
 * @author arunk
 */
package atmproblemonsync;
/**
 * class for ATM 
 * @author arunk
 */

class ATM 
{
    /**
     * Synchronized method to check the balance and prints the balance
     * @param n is name of the user
     * @return void
     */
  synchronized public void checkBalance(String n)
    {
        System.out.println("Mr."+n+" account balance is 10,000");
        try{Thread.sleep(1000);}catch(InterruptedException e){}
    }
  /**
   * Synchronized method fro withdrawing the balance
   * @param n takes the name of user
   * @param A take a amount which has to be withdrawn
   * @return void
   */
    synchronized public void Withdraw(String n,int A)
    {
        System.out.println("Mr."+n+" collect your money "+A);
        try{Thread.sleep(1000);}catch(InterruptedException e){}
       
    }
    
}
/**
 * class of user
 * @author arunk
 */
class User extends Thread
{
    
    ATM m;
    String Name;
    int a;
    /**
     * Parametrized constructor 
     * @param k ATM refernce
     * @param N name string 
     * @param j amount withdrawn 
     */
    public User(ATM k,String N,int j)
    {
        m=k;
        Name=N;
        a=j;
    }
    /**
     * run method which is @Overrided 
     * 
     */
    @Override
    public void run()
    {
        m.checkBalance(Name);
        m.Withdraw(Name, a);
    }
        
}
/**
 * public class for testing 
 * @author arunk
 */
public class ATMproblemOnSync {

    /**
     * main method 
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception
    {
        ATM h=new ATM();
        User u1=new User(h,"arun",2000);
        User u2=new User(h,"karun",5000);
        u1.start();
        u2.start();
    }
    
}

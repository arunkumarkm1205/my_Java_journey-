/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classroomintertreadcommuntication;

/**
 *
 * @author arunk
 */
class WhiteBoard
{
    int nos=0;
    int count=0;
    String text;
    
    synchronized public void write(String s)
    {
        while(count!=0)
            try{wait();}catch(InterruptedException E){}
        text=s;
        count=nos;
        notifyAll();
    }
    synchronized public String read()
    {
        String line;
        while(count==0)
            try{wait();}catch(InterruptedException E){}
        count--;
        line=text;
        if(count==0)
             notify();
        return line;
    }
    public void Attendence()
    {
        nos++;
    }
}
class Teacher extends Thread
{
    WhiteBoard b;
    String line;
    
    public Teacher(String l,WhiteBoard k)
    {
        line=l;
        b=k;
    }
    @Override
    public void run()
    {
        while(true)
        {
        b.write(line);
        System.out.println(line + "is wriiten");
        }
    }
}
class Student extends Thread
{
    WhiteBoard b;
    String name;
    
    public Student(String l,WhiteBoard k)
    {
        b=k;
        name=l;
       
    }
    @Override
    public void run()
    {
        b.Attendence();
        while(true)
        {
        System.out.println(name+" "+b.read());
        }
    }
}
public class ClassroomInterTreadCommuntication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     WhiteBoard b=new WhiteBoard();
     Teacher t1=new Teacher("java is a language",b);
     Teacher t2=new Teacher("it is OOPS",b);
     Teacher t3=new Teacher("java Supports MulltiThreading",b);
     Teacher t4=new Teacher("END",b);
     Student s1=new Student("arun",b);
     Student s2=new Student("karun",b);
     Student s3=new Student("tharun",b);
     Student s4=new Student("varun",b);
     t1.start();
     t2.start();
     t3.start();
     t4.start();
     s1.start();
     s2.start();
     s3.start();
     s4.start();
     
    }
    
}

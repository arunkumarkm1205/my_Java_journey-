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
    public void Attendence()
    {
        nos++;
    }
    
    synchronized public void write(String s)
    {
        System.out.println("teachers is writting"+s);
        while(count!=0)
            try{wait();}catch(InterruptedException E){}
        text=s;
        count=nos;
        notifyAll();
    }
    synchronized public String read()
    {
        
        while(count==0)
            try{wait();}catch(InterruptedException E){}
        String line=text;
        count--;
        if(count==0)
             notify();
        return line;
    }
    
}
class Teacher extends Thread
{
    WhiteBoard b;
    String line;
    String notes[]={"java is lang","its OOPS","its Supports multitrading","END"};
    public Teacher(WhiteBoard k)
    {
        b=k;
    }
    @Override
    public void run()
    {
        for(int i=0;i<notes.length;i++)
        {
           b.write(notes[i]);
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
        String text;
        b.Attendence();
        do
        {
        text=b.read();
        System.out.println(name+" Reading "+text);
        System.out.flush();
        }while(!text.equals("END"));
    }
}
public class ClassroomInterTreadCommuntication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     WhiteBoard b=new WhiteBoard();
     Teacher t1=new Teacher(b);
     Student s1=new Student("arun",b);
     Student s2=new Student("karun",b);
     Student s3=new Student("tharun",b);
     Student s4=new Student("varun",b);
     t1.start();
     s1.start();
     s2.start();
     s3.start();
     s4.start();
     
    }
    
}

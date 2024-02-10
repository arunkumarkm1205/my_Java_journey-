/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandlingexcersie;

class Stackunderflow extends Exception{
    @Override
    public  String toString(){
        return "stack Empty";
    }
}
class Stackoverflow extends Exception{
    
    @Override
    public  String toString(){
        return "stack Full";
    }
}
class Stack{
    private final int size;
    private int top=-1;
    private final int S[];
    
    public Stack(int s){
        size=s;
        S=new int[size];
    }
    public void push(int x) throws Stackoverflow
    {
        if(top==size-1)
            throw new Stackoverflow();
        top++;
        S[top]=x;
        
    }
    public int pop() throws Stackunderflow{
        if(top==-1)
            throw new Stackunderflow();
        int x=S[top];
        return x;
    }
}
    
public class EXceptionHandlingExcersie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Stack r=new Stack(5);
       try
       {
       r.pop();
       }
       catch(Stackunderflow e)
        {
          System.out.println(e);
        }
       try
       {
       r.push(1);
       r.push(2);
       r.push(3);
       r.push(4);
       r.push(5);
       r.push(1);
       }
     catch(Stackoverflow e)
     {
          System.out.println(e);
     }
      
       
    }
    
}

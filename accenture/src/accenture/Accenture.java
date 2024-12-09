/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accenture;

/**
 *
 * @author arunk
 */
public class Accenture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="Hell@o123";
        boolean U=false,N=false,NS=true,Sl=false,SC=false,TS=true,valid=false;
        if(s.length()<8)
            Sl=true;
        
        for(int i=0;i<s.length();i++)
        {
                char ch=s.charAt(i);
                if(s.charAt(i)>=65&& s.charAt(i)<=90)
                    U=true;
                if(s.charAt(i)>=48&& s.charAt(i)<=57)
                    N=true;
                if(s.charAt(i)==32)
                    NS=false;
                if("!@#$%^&*()-+".indexOf(ch)>=0)
                    SC=true;
                if(i>0 && s.charAt(i)==s.charAt(i-1))
                   TS=false;
        }
        if(U==true&&N==true&&NS==true&&Sl==true&&SC==true&&TS==true)
        {
           valid=true;
        }
          System.out.println(valid);  
            
        }
    }
    

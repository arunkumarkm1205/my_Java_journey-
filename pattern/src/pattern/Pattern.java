/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pattern;

/**
 *
 * @author arunk
 */
public class Pattern 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)   
        { 
            for(int j=1;j<=5;j++)
            {
               if((j+i)<6)
                    System.out.format("   ");
               else 
                    System.out.print(" * ");
            }
            for(int k=1;k<5;k++)
            {
                if(i<=k) 
                    System.out.print("   ");
                else 
                    System.out.print(" * ");
            }
        System.out.println("");
        }
         for(int m=1;m<5;m++)   
        { 
            for(int n=4;n>0;n--)
            {
               if((m+n)<5)
                    System.out.format(" * ");
               else 
                    System.out.print("   ");
            }
            for(int l=4;l>0;l--)
            {
                if(m<=l) 
                    System.out.print(" * ");
                else 
                    System.out.print("   ");
            }
              System.out.println("");
        }
          
    }  
}  

    


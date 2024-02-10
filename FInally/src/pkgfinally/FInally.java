/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinally;


public class FInally {
    static void meth1()throws Exception
    {
        try{
            throw new Exception();
        }
        finally{
            System.out.println("hello world ");
        }
            
    }
        
    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        try{
        System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally statement");
        }
        
        meth1();
    }
    
}

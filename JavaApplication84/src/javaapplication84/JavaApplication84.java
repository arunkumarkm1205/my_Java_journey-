/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication84;
import java.lang.*;
import java.io.*;
/**
 *
 * @author arunk
 */
public class JavaApplication84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
//        try{
            try( FileOutputStream fos=new FileOutputStream("C:/Users/arunk/Desktop/text.txt")){
             String str="learn java Programming";
             byte b[]=str.getBytes();
//             for(byte x:b){
//                 fos.write(x);
//             }
              fos.write(b,6,str.length()-6);
                 
//             fos.write(str.getBytes());
             fos.close();
            }
//        }
//       catch(FileNotFoundException e){
//           System.out.println(e);
//       }
//        catch(IOException e){
//            System.out.println(e);
//        }
    }
    
}

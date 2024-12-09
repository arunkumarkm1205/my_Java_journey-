/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileread;
import java.io.*;
/**
 *
 * @author arunk
 */
public class FileRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        try(FileReader fis=new FileReader("C:/Users/arunk/Desktop/text.txt")){
//           byte b[]=new byte[fis.available()];
//            fis.read(b);
//            String str=new String(b);
//            System.out.println(str);
          int x;
          while((x=fis.read())!=-1){
              System.out.print((char)x);
          }
            
        }
    }
    
}

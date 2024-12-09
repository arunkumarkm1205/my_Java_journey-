/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twotoone;
import java.io.*;
/**
 *
 * @author arunk
 */
public class Twotoone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        String str1,str2;
        // TODO code application logic here
        try(FileInputStream fis1=new FileInputStream("C:/Users/arunk/Desktop/text.txt")){
            byte b1[]=new byte[fis1.available()];
            fis1.read(b1);
            str1=new String(b1);
            fis1.close();
        }
        try(FileInputStream fis2=new FileInputStream("C:/Users/arunk/Desktop/text2.txt")){
            byte b2[]=new byte[fis2.available()];
                    fis2.read(b2);
            str2=new String(b2);
            fis2.close();
        }
        str1=str1.concat(str2);
        try(FileOutputStream fos=new FileOutputStream("C:/Users/arunk/Desktop/text3.txt")){
            byte p[]=str1.getBytes();
            fos.write(p);
            fos.close();
        }
            
    }
    
}

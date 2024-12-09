
import java.io.*;

public class CopyPastefile {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
            String str;
        try(FileInputStream fis=new FileInputStream("C:/Users/arunk/Desktop/text.txt")){
            byte b[]=new byte[fis.available()];
            fis.read(b);
             str=new String(b);
             fis.close();
            
        }
        try(FileOutputStream fos=new FileOutputStream("C:/Users/arunk/Desktop/text2.txt")){
            byte w[]=str.getBytes();
            for(byte x:w){
                if(x>=65 && x<=90)
                    x=(byte)(x+32);
                fos.write(x);
            }
            fos.close();
        }
    }
    
}

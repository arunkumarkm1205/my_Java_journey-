/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

class Phone{
    void call(){System.out.println("dial the number");}
    void sms(){System.out.println("enter your SMS");}

}


interface ICamara{
    void clickphoto();
    void recordvideo();
}
interface IMusicPlayer{
    void startmusic();
    void stopmusic();
    
}
class Smartphone extends Phone implements ICamara,IMusicPlayer{
    @Override
    public void clickphoto(){
        System.out.println("photo captured");
    }
    @Override
    public void recordvideo(){
        System.out.println("video recorded");
    }
    @Override
    public void startmusic(){
        System.out.println("music started");
    }                                           
    @Override
    public void stopmusic(){
        System.out.println("music stopped");
    }
    public void videocall(){
        System.out.println("Video call started");
    }
}

public class Interface {

   
    public static void main(String[] args) {
        Smartphone s23=new Smartphone();
        s23.call();
        s23.clickphoto();
        s23.recordvideo();
        s23.sms();
        s23.startmusic();
        s23.stopmusic();
        
    }
       
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton_coffemachine;
class CoffeMachine{
    private float milkquant;
    private float waterquant;
    private float coffequant;
    private float sugarquant;
    
    static CoffeMachine my=null;
    private CoffeMachine(){
        milkquant=1;
        waterquant=1;
        coffequant=1;
        sugarquant=1;
    }
    public void addmilk(float m){
        milkquant=m;
    }
    public void streangth(float cf){
        coffequant=cf;
    }
    public void sweet(float s){
        sugarquant=s;
    }
    public void addwater(float w){
        waterquant=w;
    }
    public float getcoffe(){
    return (milkquant+coffequant+sugarquant+waterquant);
    }
    static CoffeMachine Instence(){
        if(my==null)
            my=new CoffeMachine();
        return my;
    }
}
    

public class Singleton_coffeMachine {

   
    public static void main(String[] args) {
       CoffeMachine m1=CoffeMachine.Instence();
       CoffeMachine m2=CoffeMachine.Instence();
       CoffeMachine m3=CoffeMachine.Instence();
       
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)
            System.out.println("same");
        
    }
    
}

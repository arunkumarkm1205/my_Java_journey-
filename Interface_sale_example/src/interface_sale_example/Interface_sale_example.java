/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface_sale_example;
interface Member{
    void callback();
}
class Customer implements Member
{
    String name;
    public Customer(String s){
        name=s;
    }
    @Override
    public void callback(){
        System.out.println("i will vist the store "+name);
    }
        
}
class Store {
    Member mem[]=new Member[100];
    int count=0;
    public void register(Member m){
        mem[count++]=m;
    }
    public void sale_invite(){
        for(int i=0;i<count;i++){
            mem[i].callback();
        }
    }
    
}
public class Interface_sale_example {

    
    public static void main(String[] args) {
       Store s1=new Store();
       Customer c1=new Customer("arun");
       Customer c2=new Customer("tharun");
       s1.register(c1);
       s1.register(c2);
       s1.sale_invite();
       
    }
    
}

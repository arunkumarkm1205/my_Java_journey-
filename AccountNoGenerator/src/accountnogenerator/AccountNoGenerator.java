/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accountnogenerator;

class Account {
    private static long count=1;
    public String Name;
    public String BankBranch;
    public String ACCNo;
    
    
    public Account(String N,String B){
        
        Name=N;
        BankBranch=B;
        ACCNo=generator();
    }
    private static String generator(){
        String rn="SBI"+"00"+count++;
        return rn;
    }
    
    
}
public class AccountNoGenerator {

    
    public static void main(String[] args) {
       Account A1,A2,A3,A4;
       A1=new Account("Arun","Mysuru");
       A2=new Account("varun","Mysuru");
       A3=new Account("tharun","Mysuru");
       A4=new Account("arjun","Mysuru");
       
       
        System.out.println(A1.ACCNo);
        System.out.println(A2.ACCNo);
        System.out.println(A3.ACCNo);
        System.out.println(A4.ACCNo);
    }
    
}

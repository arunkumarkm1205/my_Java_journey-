/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rollnogenerator;
import java.util.*;

class Student{
    private static long count=1;
    public String Name;
    public String Branch;
    public String RollNo;
    
    public Student(String N,String B){
        RollNo=generator();
        Name=N;
        Branch=B;
    }
    private static String generator(){
        Date D=new Date();
        String rn="PES-"+(D.getYear()+1900)+"-"+count++;
        return rn;
    }
}
public class RollNoGenerator {

    
    public static void main(String[] args) {
        
        Student S1=new Student("Arun","ECE");
        Student S2=new Student("Tharun","ECE");
        Student S3=new Student("Varun","ECE");
        Student S4=new Student("Arjun","ECE");
        
        
        System.out.println(S1.RollNo);
        System.out.println(S2.RollNo);
        System.out.println(S3.RollNo);
        System.out.println(S4.RollNo);
        
        
         
        
    }
    
}

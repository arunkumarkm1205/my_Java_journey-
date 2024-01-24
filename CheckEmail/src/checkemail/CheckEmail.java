/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkemail;

import java.lang.*;
import java.util.Scanner;
public class CheckEmail {

    
    public static void main(String[] args) {
       int i;
       String email;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Your email:");
       email=sc.nextLine();
       System.out.println("the give email is gmail?");
       System.out.println(email.matches("\\w*@gmail.*"));
       i=email.indexOf("@");
       String UserName=email.substring(0, i);
       String DomainName=email.substring(i);
       System.out.println("the UserName Is :"+UserName);
        System.out.println("the DomainName Is :"+DomainName);
        
    }
    
}

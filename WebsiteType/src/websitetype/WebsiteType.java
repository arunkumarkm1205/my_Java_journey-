/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package websitetype;

public class WebsiteType {

   
    public static void main(String[] args) {
        String url="ftp://www.google.net";
        if(url.startsWith("https"))
            System.out.println("hyper text tranport protocal");
        else if(url.startsWith("ftp"))
            System.out.println("file transfer protocal");
        else 
            System.out.println("invalid protocal");
        if(url.endsWith(".com"))
            System.out.println("commerical");
        else if(url.endsWith(".org"))
            System.out.println("organisation");
        else if(url.endsWith(".net"))
            System.out.println("network");
        
    }
    
}

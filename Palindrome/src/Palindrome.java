/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
public class Palindrome {

   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n,m,j,k,c=0,s=0;
        System.out.print("Enter the number:");
        n=sc.nextInt();
        m=k=n;
        while(k!=0)
        {
            k=k/10;
            c++;
        }
        int g=c-1;
        for(int i=0;i<c;i++)
        {
            int l=m%10;
            m=m/10;
            s+=l*Math.pow(10, g--);
        }
       if(s==n)
            System.out.println(s+" is a palindrome number ");
       else
            System.out.println(n +" not palindrome number");
    }
    
}
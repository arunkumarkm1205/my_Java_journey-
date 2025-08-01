/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feboncci;

import java.util.Scanner;
public class Feboncci {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=0,second=1,third;
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        System.out.println(first+"\n"+second);
        for(int i=0;i<n;i++)
        {
            third=first+second;
            first=second;
            second=third;
            System.out.println(+third);
        }
    }
    
}

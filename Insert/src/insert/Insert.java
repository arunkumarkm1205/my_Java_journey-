/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insert;


public class Insert {

    
    public static void main(String[] args) {
       int A[]={1,2,3,4,5,6,7,8,9};
       int x=5,y=11;
       int temp=A[x];
       for(int i=x-1;i<A.length-1;i++)
       {
           A[i]=A[i+1];
       }
       
       for(int k:A)
       {
           System.out.print(k+" ");
       }
    }
    
}

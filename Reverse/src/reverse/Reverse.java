/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverse;

public class Reverse {
 static int rev(int a)
 {
     int r=0;
     while(a!=0)
     {
         int l=a%10;
         a=a/10;
         r=r*10+l;
     }
     return r;
 }
 static int[] rev(int A[])
 {
     int B[]=new int [A.length];
     for(int i=0,j=A.length-1;i<=A.length-1;i++,j--)
     {
         B[i]=A[j];
     }
     return B;
 }
    
    public static void main(String[] args) {
        System.out.println(rev(253));
        int A[]={1,2,3,48,69,75,89,8,6};
        int k[]=rev(A);
        for(int x:k){
           System.out.print(x+",");
        }
    }
    
}

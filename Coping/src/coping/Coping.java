/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coping;

public class Coping {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9};
        int B[]=new int[2*A.length];
        System.out.println(A.length);
        for(int i=0,j=A.length-1;j>=0;i++,j--)
        {
            B[i]=A[j];
//            System.out.println(B[i]);
        }
        A=B;
        B=null;
        System.out.println(A.length);
    }
    
}

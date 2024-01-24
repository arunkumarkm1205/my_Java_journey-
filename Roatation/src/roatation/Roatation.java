/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roatation;
public class Roatation {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9};
        int temp=A[A.length-1];
        for(int i=A.length-1;i>0;i--)
        {
            A[i]=A[i-1];
        }
        A[0]=temp;
        for(int x:A)
        {
            System.out.print(x+",");
        }
    }
    
}

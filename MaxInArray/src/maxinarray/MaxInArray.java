/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxinarray;

public class MaxInArray {
    static int max(int A[])
    {
        int m=0;
        for(int i=0;i<A.length;i++)
        {
            if(m<A[i])
                m=A[i];
            
            
        }
        return m;
        
    }
    public static void main(String[] args) {
        int A[]={1,2,31253,45,554565,7,6,4,5,7,5,4564554,453,67,3335,2245};
        System.out.println(max(A));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixmulti;


public class MatrixMulti {

    
    public static void main(String[] args) {
     int A[][]={{1,2,3},{4,5,6},{7,8,9}};
     int B[][]={{1,2,3},{4,5,6},{7,8,9}};
     int C[][]=new int[3][3];
     for(int i=0;i<A.length;i++)
     {
         for(int j=0;j<A[0].length;j++)
         {
           for(int n=0;n<A[0].length;n++)
               C[i][j]=A[i][n]*B[n][j];
         }
     }
     for(int i=0;i<A.length;i++)
     {
         for(int j=0;j<A[0].length;j++)
         {
           
               System.out.print(C[i][j]+" ");
         }
         System.out.println("");
     }
     
    
    }
    
}

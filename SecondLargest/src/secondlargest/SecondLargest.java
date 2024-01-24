/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondlargest;

public class SecondLargest {

    public static void main(String[] args) {
        int a[]={11,2,35,4,23,4,5,6,2,1,4,6,7,233};
        int max=0,second=0;
        for(int x:a)
        {
            if(max<x)
            {
                second=max;
                max=x;
            }
                
        }
        System.out.println(max+" "+second);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leapear;

import java.lang.*;
import java.util.Scanner;
public class Leapear 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=1904;
        if(year%4==0&&(year%100!=0||year%400==0))
            System.out.println("LEAPEAR");
        else
            System.out.println("Not a LEAPEAR");
    }
    
}

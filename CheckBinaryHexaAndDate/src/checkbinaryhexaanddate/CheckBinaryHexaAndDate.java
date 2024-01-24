/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkbinaryhexaanddate;

import java.lang.*;
import java.util.Scanner;

public class CheckBinaryHexaAndDate {
    
    public static void main(String[] args) {
        int b=1010;
        String sh="af120";
        String date="12/02/2004";
        String sb=b+"";
        
        System.out.println("the enter value is binary");
        System.out.println(sb.matches("[01]+"));
        System.out.println("the enter value is hexadecimal");
        System.out.println(sh.matches("[0-9|a-f]+"));
        System.out.println("the enter date is valid");
        System.out.println(date.matches("[0-3][0-9].[0-1][0-9].[0-9]{4}"));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package removespecialcharacter;


public class RemoveSpecialCharacter {

    
    public static void main(String[] args) {
        String str="    ar%^u(n@#  thar$%un%   &ra<hu>l      ";
        str=str.replaceAll("[^A-Za-z0-9\\s]", "");
        str=str.replaceAll("\\s+", " ").trim();
        String words[]=str.split("\\s");
        System.out.println("number of names :"+words.length);
        System.out.println(str);
       
    }
    
}

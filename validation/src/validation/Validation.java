/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validation;

public class Validation {
 static boolean validate(String name)
 {
     return name.matches("[a-zA-Z]+");
 }
 static boolean validate(int age)
 {
     return age>3&&age<15;
 }
 
    public static void main(String[] args) 
    {
       String Name="Arun";
       int Age=14;
        System.out.println("Name is valid? "+validate(Name));
        System.out.println("Age is valid? "+validate(Age));
    }
    
}

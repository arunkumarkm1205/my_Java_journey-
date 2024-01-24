/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package school;
class Student{
    public int rollno;
    public String Name;
    public String course;
    public int m1,m2,m3;
    
    public int average()
    {
        return (m1+m2+m3)/3;
    }
    public char grade(){
        if(average()>=80)
            return 'S';
        else 
            return 'A';
    }
    public String toString(){
        return "NAME"+Name+"\n RollNo "+rollno+"\n Course "+course;
    }
}

public class School {

    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.Name="Arun Kumar K M";
        s1.rollno=1205;
        s1.course="ECE";
        s1.m1=50;
        s1.m2=60;
        s1.m3=70;
        System.out.println("Student Name "+s1.Name);
        System.out.println("Average "+s1.average());
        System.out.println("Student Grade "+s1.grade());
        System.out.println("details \n "+ s1 );
    }
    
}

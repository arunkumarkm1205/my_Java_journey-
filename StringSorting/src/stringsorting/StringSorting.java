/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringsorting;


public class StringSorting {

    
    public static void main(String[] args) {
        String name[]={"Mandya", "Maddur", "Mysore", "Bangalore", "Dharwad", "Belagavi", "Kunigal"};
        int size=name.length;
        String temp=null;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                    
                if(name[i].compareTo(name[j])<0)
                {
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                    
                }
            }
        }
        for (int k=0;k<size;k++)
              System.out.println(name[k]);
           
    }
    
}

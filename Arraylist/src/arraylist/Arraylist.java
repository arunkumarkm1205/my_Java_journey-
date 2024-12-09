/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;
import java.util.*;
/**
 *
 * @author arunk
 */
public class Arraylist {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,100,55,88));
        
        al1.add(10);
        System.out.println(al1.size());
        al1.addAll(1,al2);
        al1.add(5, 40);
        al1.set(4, 25);
        al1.forEach(n->System.out.println(n));
        for(ListIterator<Integer> it=al1.listIterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
    
}

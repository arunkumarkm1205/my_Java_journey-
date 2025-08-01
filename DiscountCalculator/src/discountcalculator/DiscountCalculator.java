/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discountcalculator;

/**
 *
 * @author arunk
 */
public class DiscountCalculator {

    static double discount(double ...D)
    {
        double sum=0,dp;
        for(int i=0;i<D.length;i++)
        {
            sum=D[i];
            
        }
        if(sum>2000)
        {
            dp=sum-(sum*0.2);
            return dp;
        }
        else
        {
            dp=sum-(sum*0.1);
            return dp;
        }
    }
    
    public static void main(String[] args) {
        double DiscountPrice;
        DiscountPrice=discount(1000,5220,54680.55,4568.56);
        System.out.format("discount price: %.2f",DiscountPrice);
    }
}

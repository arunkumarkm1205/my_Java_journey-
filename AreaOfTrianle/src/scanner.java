import java.lang.*;
import java.util.Scanner;
class AreaOfTrianle
{
    public static void main(String arr[])
    {
        float hieght,base,area;
        Scanner s=new Scanner(System.in);
        
        System.out.print("enter Length and Breadth of the triangle:");
        hieght=s.nextFloat();
        base=s.nextFloat();
        area=(hieght*base)/2;
        System.out.println("the area of the traingle: "+area);
    }
}
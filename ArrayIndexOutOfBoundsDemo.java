import java.util.*;
public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args)
    {
        int[] x=new int[10];
        Random r=new Random();
        for(int i=0;i<x.length;i++)
        {
            x[i]=r.nextInt(1000);
        }
        try{
            System.out.println(x[2]);
        }
        catch(Exception e)
        {
            System.out.println("Sorry!The maximum index is 9!");
        }
        System.out.println("The values of the array are:");
        for(int i:x)
        {
            System.out.print(i+"  ");
        }
    }
    
}

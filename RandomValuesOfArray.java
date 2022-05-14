import java.util.*;
public class RandomValuesOfArray {
    public static void main(String[] args)
    {
        Random r=new Random();
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=r.nextInt(100);
        }
        System.out.println("The values of the array are:");
        for(int i:arr)
        {
            System.out.print(i+"  ");
        }
    }
    
}

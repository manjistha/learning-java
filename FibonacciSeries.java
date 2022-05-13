import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("The Fibonacci series from beginning uptil "+n+" is");
        int prevTerm=0,nextTerm=1,newTerm;
        System.out.print(prevTerm+" "+nextTerm+" ");
        for(int i=0;i<n-2;i++)
        {
            newTerm=prevTerm+nextTerm;
            System.out.print(newTerm+" ");
            prevTerm=nextTerm;
            nextTerm=newTerm;
        }
    }
}

import java.util.*;
public class PerfectNumberCheck {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int factorSum=0;
        System.out.println("The factors of "+n+" are");
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                factorSum+=i;
            }
            
        }
        System.out.println();
        if(n==factorSum)
        System.out.println("The number "+n+" is a Perfect Number.");
        else
        System.out.println("The number "+n+" is not a Perfect Number.");
    }
    
}

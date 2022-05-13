import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int temp=n,revNum=0;
        while(temp!=0)
        {
            
            int lastDigit=temp%10;
            temp/=10;
            revNum=revNum*10+lastDigit;
           
        }
        System.out.println("The number in reverse is "+revNum);
        if(n==revNum)
        System.out.println("The number "+n+" is a palindrome number.");
        else
        System.out.println("The number "+n+" is not a palindrome number.");
    }

    
}

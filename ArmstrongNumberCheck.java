import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class ArmstrongNumberCheck {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int num=n,sumOfCubeOfDigits=0,lastDigit;
        while(num!=0)
        {
            lastDigit=num%10;
            num/=10;
            sumOfCubeOfDigits+=lastDigit*lastDigit*lastDigit;
        }
        System.out.println("The sum of cube of the digits of "+n+" is "+sumOfCubeOfDigits);
        if(n==sumOfCubeOfDigits)
        System.out.println("The number "+n+" is an Armstrong Number.");
        else
        System.out.println("The number "+n+" is not an Armstrong Number.");
    }

    
}

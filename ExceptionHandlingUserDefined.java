import java.util.Scanner;
public class ExceptionHandlingUserDefined {
    public static void main(String[] args)
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of i");
        i=sc.nextInt();
        try{
            if(i>5)
            {
                throw new MyException("Oho....Errorrr");
            }
            System.out.println("The value of i is "+i);
        }
        catch(MyException me)
        {
            System.out.println(me);
        }
    }
    
}
class MyException extends Exception
{
    public MyException(String msg)
    {
        super(msg);
    }
}

import java.io.*;
public class ExceptionHandlingDemo2 {
    public static void main(String[] args)
    {
        int i,j,k;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of j:");
        i=2;
        try{
            j=Integer.parseInt(br.readLine());
            k=i/j;
            System.out.println("The value of k is "+k);
            System.out.println("Bye...");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by 0 not possible...");
        }
        catch(IOException ie)
        {
            System.out.println("Wrong input");
        }
        catch(Exception e)
        {
            System.out.println("Unknown Exception");
        }
        finally
        {
            System.out.println("Finally BYE...");
        }
    }
    
}

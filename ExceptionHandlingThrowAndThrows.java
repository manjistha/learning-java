import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ExceptionHandlingThrowAndThrows {
    public static void main(String[] args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=5,j,k;
        System.out.println("Enter the value of j:");
        j=Integer.parseInt(br.readLine());
        try{
            k=i+j;
            if(k>10)
            {
                throw new ArithmeticException();
            }
            System.out.println("k is "+k);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Maximum value has been reached.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally Bye...");
        }
    }
    
}

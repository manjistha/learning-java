import java.io.InputStreamReader;
import java.io.BufferedReader;
public class ExceptionHandlingWithResource {
    public static void main(String[] args)throws Exception
    {
        //whenever we send a resource inside try block, we do not need the catch block
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            String str="";
            str=br.readLine();
            System.out.println(str+".");
        } 
    }
    
}

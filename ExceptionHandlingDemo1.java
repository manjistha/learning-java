//unchecked exception
/*Throwable class has two types exceptions and errors. */
/*Exceptions can be handled,errors can't. */
/*Exceptions are of two types checked and unchecked.In checked exception we have 
 *runtime exception and SQLException. In unchecked exception, we have ArithmeticException etc.
 */
public class ExceptionHandlingDemo1 {
    public static void main(String[] args)
    {
        int i,j,k=0;
        i=2;
        j=0;
        int a[]=new int[5];
        try {
          
            for(int x=0;x<=5;x++)
            {
                a[x]=x+1;
            }
            for(int value:a)
            System.out.println(value);
            k=i/j;
        } 
        catch (ArithmeticException ae) {
            System.out.println("Cannot divide by 0");
            //TODO: handle exception
        }
       
        catch(ArrayIndexOutOfBoundsException aibe)
        {
            System.out.println("Array limit reached.Please check.");
        }
        System.out.println(k);

    }
    
}

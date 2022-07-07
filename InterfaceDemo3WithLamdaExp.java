public class InterfaceDemo3WithLamdaExp {
    public static void main(String[] args)
    {
        A obj=() ->
            {
                System.out.println("in show");
            }
        }
        ;
        obj.show();//lambda expression is not supported in this Java version
    }
    
}
interface A
{
    public void show();
}
/*interface B 
{

}
interface C extends A,B
{

}*/
/* Marker Interface -> Interface with no methods
 * SAM -> Single Abstract Method Interface -> Functional Interface
 * Normal Interface
 * 1)It is through Interface that Multiple Inheritance is supported in Java.
 * 2)Through interface if we inherit another interface we use "extends" not "implements".
 */
/* Method Overloading/Early Binding/Static Binding/Compile Time Binding*/
public class MethodOverloading {
    public static void main(String[] args)
    {
        A obj=new A();
        obj.show(9);//the method signature which matches this parameter
        //type is called
    }
    
}
class A
{
    public void show()
    {
        System.out.println("Hello");
    }
    public void show(int a)
    {
        System.out.println("Hello 1 "+a);
    }
    public void show(double b)
    {
        System.out.println("Hello 2 "+b);
    }
}

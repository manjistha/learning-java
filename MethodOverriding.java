/*Method Overriding/Late Binding/Dynamic Binding/Runtime Binding*/
public class MethodOverriding {
    public static void main(String[] args)
    {
        B obj=new B();
        obj.show();//show() of B overrides A
    }
    
}
class A
{
    public void show()
    {
        System.out.println("In A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("In B");
    }
}

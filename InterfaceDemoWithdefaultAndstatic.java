public class InterfaceDemoWithdefaultAndstatic {
    public static void main(String[] args)
    {
        A obj=new A();
        obj.show();
    }
}
interface A
{
    default void show()
    {
        System.out.println("in show");
    }
}

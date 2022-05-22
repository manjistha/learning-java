public class AnonymousObjectDemo {
    public static void main(String[] args)
    {
        A obj=new A();
        obj.k=9;
        obj.show();
        new A().k=10;//anonymous object
        new A().show();
    }
    
}
class A
{
    int k;
    
    public void show()
    {
        System.out.println("The value of k is "+k+".");
    }
}

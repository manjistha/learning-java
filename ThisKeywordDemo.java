public class ThisKeywordDemo {
    public static void main(String[] args)
    {
        A ob1=new A(10);
        A ob2=new A(50);
        A ob3=new A(100);
        ob1.show();
        ob2.show();
        ob3.show();
    }
    
}
class A
{
    int x;
    A(int x)
    {
        this.x=x;//referes to the current instance/object
    }
    public void show()
    {
        System.out.println("The value is "+x+".");
    }
}

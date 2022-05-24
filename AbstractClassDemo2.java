public class AbstractClassDemo2 {
    public static void main(String[] args)
    {
        Iphone ob1=new Iphone();
        Redmi9i ob2=new Redmi9i();
        SamsungS12 ob3=new SamsungS12();
        show(ob1);
        show(ob2);
        show(ob3);
    }

        public static void show(Phone obj)
        {
            obj.display();
        }

    
    
}
abstract class Phone
{
    abstract public void display();
}
class Iphone extends Phone
{
    public void display()
    {
        System.out.println("IPhone...");
    }
    
}
class Redmi9i extends Phone
{
    public void display()
    {
        System.out.println("Redmi9I...");
    }
}
class SamsungS12 extends Phone
{
    public void display()
    {
        System.out.println("Samsung S12...");
    }
}
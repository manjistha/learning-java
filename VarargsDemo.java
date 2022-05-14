//Varargs is used in ArrayList
public class VarargsDemo {
    public static void main(String[] args)
    {
        Display d=new Display();
        d.show(1,2,3,4);
        d.show(23);
    }
    
}
class Display{
    public void show(int ... x)
    {
        for(int i:x)
        System.out.println(i);
    }
    public void show(int x)//first it checks for the exact match then it moves to the method with Varargs.
    {
        System.out.println(x+" in show x");
    }
}

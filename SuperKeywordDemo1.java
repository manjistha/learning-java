public class SuperKeywordDemo1 {
    public static void main(String[] args)
    {
        Y ob=new Y(4);
        
    }
    
}
class X
{
    X()//this calls by this the constructor of Object Class
    {
        System.out.println("In constructor X");
    }
    X(int i)
    {
        System.out.println("In Parameterized Constructor X");
    }
}
class Y extends X
{
    Y()
    {
        System.out.println("In Constructor Y");
    }
    Y(int i)
    {
        System.out.println("In parameterized constructor Y");
    }

}

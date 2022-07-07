public class StringHandlingDemo2toString {
    public static void main(String[] args)
    {
        Demo d=new Demo("Manjistha",555);
        System.out.println(d);
    }
    
}
class Demo extends Object{
    String name;
    int roll;
    Demo(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    public String toString()
    {
        return name+":"+roll;
    }
}

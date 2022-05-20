public class SingleLevelInheritance {
    public static void main(String[] args)
    {
        AddSub a =new AddSub();
        a.x=5;
        a.y=4;
        a.sum();
        System.out.println(a.res);
        a.diff();
        System.out.println(a.res);
        
    }
    
}
class Add
{
    int x,y,res;
    public void sum()
    {
        res=x+y;
        
    }
}
//single level inheritance
class AddSub extends Add
{
    
    public void diff()
    {
        res=x-y;
        
    }
}

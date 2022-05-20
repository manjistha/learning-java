public class MultiLevelInheritance {
    public static void main(String[] args)
    {
        AddSubMul obj=new AddSubMul();
        obj.x=9;
        obj.y=10;
        obj.sum();
        System.out.println("The sum is  "+obj.res);
        obj.diff();
        System.out.println("The difference is  "+obj.res);
        obj.product();
        System.out.println("The product is  "+obj.res);
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
class AddSub extends Add
{
    public void diff()
    {
        res=x-y;
    }
}
class AddSubMul extends AddSub
{
    public void product()
    {
        res=x*y;
    }

}


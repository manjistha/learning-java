public class BoxDemo1 {
    public static void main(String[] args)
    {
        double res;
        Box ob1=new Box(12.1,1.2,4.5);
        Box ob2=new Box(2.3,4.5,5.6);
        res=ob1.volume();
       
        System.out.println("The volume of Box object 1 is:"+res+" cubic units.");
        res=ob2.volume();
        System.out.println("The volume of Box object 2 is:"+res+" cubic units.");
        
    }

    
}
class Box
{
    double height,width,depth;
    Box(double h,double w,double d)
    {
        height=h;
        width=w;
        depth=d;
    }
    double volume()
    {
        return height*width*depth;
    }
}

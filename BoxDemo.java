class Box
{
    double width,height,depth;
    //
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    double volume()
    {
        return width*height*depth;
    }

}
class BoxDemo
{
    public static void main(String[] args)
    {
    Box b1=new Box(1.2,2.0,3.5);
    double vol=b1.volume();
    System.out.println(vol);
    }
}
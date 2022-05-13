//Parameterized Constructor
class Triangle
{
    double base,height;
    Triangle(double b,double h)
    {
        base=b;
        height=h;
    }
    double area()
    {
        return 0.5*base*height;
    }
}
class TriangleDemo
{
    public static void main(String[] args)
    {
        Triangle t1=new Triangle(1.0,2.0);
        Triangle t2=new Triangle(20.5,12.4);
        double areaOne=t1.area();
        double areaTwo=t2.area();
        System.out.println("The area of the first triangle object is  "+areaOne+"sq. units");
        System.out.println("The area of the second triangle object is  "+areaTwo+"sq. units");
    }
}
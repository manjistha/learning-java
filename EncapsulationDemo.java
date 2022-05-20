public class EncapsulationDemo {
    public static void main(String[] args)
    {
        Emp e1=new Emp();
        e1.setEmpName("Manjistha");
        e1.setEmpId(1);
        Emp e2=new Emp();
        e2.setEmpName("Chayan");
        e2.setEmpId(2);
        System.out.println("The Employee details are:");
        System.out.println(e1.getEmpName());
        System.out.println(e1.getEmpId());
        System.out.println(e2.getEmpName());
        System.out.println(e2.getEmpId());

    }
    
}
class Emp
{
    private String empName;
    private int empId;
    //we use getters and setters in this context
    public String getEmpName()
    {
        return empName;
    }
    public void setEmpName(String empName)
    {
        this.empName=empName;
    }
    public int getEmpId()
    {
        return empId;
    }
    public void setEmpId(int empId)
    {
        this.empId=empId;
    }


}

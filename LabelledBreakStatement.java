public class LabelledBreakStatement {
    public static void main(String[] args)
    {
        loop1:
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i==3)
                break loop1;
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}

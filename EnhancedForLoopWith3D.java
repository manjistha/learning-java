public class EnhancedForLoopWith3D {
    public static void main(String[] args)
    {
        int[][][] x=new int[3][3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                x[i][j][k]=i+j-k;
            }
        }
        System.out.println("The elements of the 3D matrix are:");
        for(int i[][]:x)
        {
            for(int j[]:i)
            {
                for(int k:j)
                {
                    System.out.print(k+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}

class PalindromeNumber
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=(5-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            //System.out.println();
            for(int j=i;j>1;j--)
            {
                System.out.print(j-1);
            }
            
            System.out.println();
        }
                
        
        
        

    }
}
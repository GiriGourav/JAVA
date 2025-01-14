public class butterflycode 
{
    public static void main(String[] args) 
    {
        /*for(int i=0;i<4;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<6-(i*2);k++)
            {
                System.out.print(" ");
            }
            for(int l=0;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>0;i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<8-(i*2);k++)
            {
                System.out.print(" ");
            }
            for(int l=0;l<i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
            */
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(4-i);j++)
            {
               System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(4-i);j++)
            {
               System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }



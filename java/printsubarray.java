import java.util.Scanner;
// print sub arrays

public class printsubarray 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[5];
        for (int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<5;i++)
        {
            for(int j=i;j<5;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

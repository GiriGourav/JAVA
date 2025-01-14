import java.util.Scanner;

public class maxsubarrysumM1 
{
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
        int arr[]= new int[5];
        for (int i=0;i<5;i++)
        {
            
            arr[i]=sc.nextInt();
        }
        int prifix[]= new int[5];
        prifix[0]=arr[0];
        for(int i=1;i<5;i++)
        {
            prifix[i]=prifix[i-1]+arr[i];
        }
        int max=Integer.MIN_VALUE;
        for(int j=0;j<5;j++)
        {   
            int cursum=0;
            for(int k=j;k<5;k++)
            {
                cursum= j==0?prifix[k]:prifix[k]-prifix[j-1];
                if(cursum>max)
                {
                    max=cursum;
                }
            }
        }
        System.out.println(max);
    }
}

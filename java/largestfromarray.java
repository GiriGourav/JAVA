import java.util.Scanner;

public class largestfromarray 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<6;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

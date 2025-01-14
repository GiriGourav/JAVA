import java.util.Scanner;

public class pairsinarray 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}

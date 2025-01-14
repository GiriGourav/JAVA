import java.util.Scanner;

public class kadanesalgorithm {

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[8];
        for(int i=0;i<8;i++)
        {
            arr[i]=sc.nextInt();
        }
        int cursum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<8;i++)
        {
           cursum=cursum+arr[i];
           if(cursum<0)
           {
            cursum=0;
           }
           
            max=Math.max(cursum, max);
        }
        System.out.println(max);
    }
}

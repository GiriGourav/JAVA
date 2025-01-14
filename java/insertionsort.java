import java.util.Scanner;

public class insertionsort 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        } 
        for(int i=1;i<6;i++)
        {
            int curr=arr[i];
            int pre=i-1;
            while(pre>=0&&arr[pre]>curr)
            {
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=curr;
        }
        for(int i=0;i<6;i++)
        {
            System.out.println(arr[i]);
        }
    }   
}

import java.util.Scanner;
public class college 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ele =sc.nextInt();
        int i=n-1;
        do{
            arr[i]=arr[i-1];
            if(ele<=arr[i])
            {
                arr[i]=ele;
                break;
            }
            i--;
        }
        while(i>0);
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
       
    }
}

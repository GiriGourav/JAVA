import java.util.Scanner;

public class Selectionsort 
{ 
     public static void main(String[] args) 
     {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<7;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++)
        {
            int min =i;
            for(int j=i+1;j<7;j++)
            {
                if(arr[min]>arr[j])
                {
                   min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        for (int i=0;i<=6;i++)
        {
            System.out.println(arr[i]);
        }
     }  
}

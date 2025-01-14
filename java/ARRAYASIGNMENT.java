import java.util.Scanner;

public class ARRAYASIGNMENT {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }


        // Question 1

        // int ct=0;
        // for(int j=0;j<x;j++)
        // {
        //     for(int k=j+1;k<x;k++)
        //     {
        //         if(arr[j]==arr[k])
        //         {
        //             ct=1;
        //             break;
        //         }
        //     }
        //     break;
        // }
        // if(ct==1)
        // {
        //     System.out.println("True");
        // }
        // else
        // {
        //     System.out.println("False");
        // }


        // Question 3


        // int curpro=0;
        // int maxpro=Integer.MIN_VALUE;
        // for(int j=0;j<x;j++)
        // {
        //    for(int k=j+1;k<x;k++)
        //    {
        //        curpro=arr[k]-arr[j];
        //        if(curpro>maxpro)
        //        {
        //            maxpro=curpro;
        //        }
        //    }
        // }
        // if(maxpro>0)
        // {
        //     System.out.println(maxpro);
        // }
        // else
        // {
        //     System.out.println(0);
        // }


        // Question 4


        // int left[]=new int[x];
        // int right[]=new int[x];
        // left[0]=arr[0];
        // right[x-1]=arr[x-1];
        // for(int j=1;j<x;j++)
        // {
        //     if(left[j-1]<arr[j])
        //     {
        //         left[j]=arr[j];
        //     }
        //     else{
        //         left[j]=left[j-1];
        //     }
        // }
        // for(int k=x-2;k>=0;k--)
        // {
        //     if(right[k+1]<arr[k])
        //     {
        //         right[k]=arr[k];
        //     }
        //     else
        //     {
        //         right[k]=right[k+1];
        //     }
        // }
        // int trapwater=0;
        // for(int l=0;l<x;l++)
        // {
        //     trapwater=trapwater+(Math.min(left[l],right[l])-arr[l]);
        // }
        // System.out.println(trapwater);


        // Question 5

        
    }
}

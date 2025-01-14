import java.util.Scanner;

public class TrappingRainWater
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<7;i++)
        {
            arr[i]=sc.nextInt();
        } 
        int lmax[]=new int[7];
        lmax[0]=arr[0];
        int rmax[]=new int[7];
        rmax[6]=arr[6];
        for(int i=1;i<7;i++)
        {
            lmax[i]=Math.max(arr[i], lmax[i-1]);
        }
        for(int i=5;i>=0;i--)
        {
            rmax[i]=Math.max(arr[i], rmax[i+1]);
        }
        for(int i=0;i<7;i++)
        {
            System.out.print(lmax[i]);
        } 
        System.out.println();
        for(int i=0;i<7;i++)
        {
            System.out.print(rmax[i]);
        } 
        System.out.println();
        int watertrped=0;
        for(int i=0;i<7;i++)
        {
            int wa=Math.min(lmax[i], rmax[i]);
            watertrped=watertrped+(wa-arr[i]);
        }
        System.out.println(watertrped);
    }
}

import java.util.Scanner;

public class setithbit 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int  ith=sc.nextInt();
        int bitmass=(1<<ith);
            System.out.println(num|bitmass);
        
    }    
}

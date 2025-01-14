import java.util.Scanner;

public class clearrangeofbits 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        int a=(~(0)<<(j+1));
        int b=(1<<i)-1;
        int bitmas=a|b;
        System.out.println(n&bitmas);
    }
    
}

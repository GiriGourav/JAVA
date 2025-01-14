import java.util.Scanner;

public class clearlastibits 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int bitmas=~(0)<<i;
        System.out.println(n&bitmas);
    }    
}

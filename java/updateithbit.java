import java.util.Scanner;

public class updateithbit 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int updt=sc.nextInt();
        int i=sc.nextInt();
        if(updt==1)
        {
            int bitmas=1<<i;
            System.out.println(n&bitmas);
        } 
        else
        {
             int bitmas=~(1<<i);
             System.out.println(n&bitmas);
        }   
    }   
}

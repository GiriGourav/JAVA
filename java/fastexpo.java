import java.util.Scanner;

public class fastexpo 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        int ans=1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans=a*ans;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }    
}

import java.util.Scanner;
public class factorial 
{
    public static int FACTORIAL(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
             fact=fact*i;
        }
        
        return fact;
        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=FACTORIAL(n);
        System.out.println(fact);
    }
    
}

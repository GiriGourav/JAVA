public class factorialbyrecursion 
{
    public static int Factorial(int n)
    {   int fact=1;
        if(n==0)
        {   
            return 1;
        }
        fact=n*Factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(Factorial(n));
    }
}

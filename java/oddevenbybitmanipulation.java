import java.util.Scanner;

public class oddevenbybitmanipulation 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int bitmass=1;
        if((num&bitmass) ==1)
        {
            System.out.println("odd");
        }
        else
        {
            System.out.println("even");
        }
    }   
}

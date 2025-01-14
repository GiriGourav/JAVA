import java.util.Scanner;

public class ispowerof2 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&(n-1))==0)
        {
           System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }    
}

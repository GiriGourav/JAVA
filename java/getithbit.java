import java.util.Scanner;

public class getithbit 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int ith=sc.nextInt();
        int bitmass=(1<<ith);
        if ((num&bitmass)==0)
        {
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
}

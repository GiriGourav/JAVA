import java.util.Scanner;

public class type_conversion 
{
    // widening or implicit
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int number=sc.nextFloat();//[wrong]
       // float number=sc.nextInt();//[correct]
        System.out.println(number);
    }
}

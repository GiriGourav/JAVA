import java.util.Scanner;

public class type_casting 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //float number=sc.nextFloat(); [correct]
        //int mark=(int) number;[correct]
        char ch='a';//[correct]
        int a=(int)ch;//[correct]
        System.out.println(a);
    }
    
}

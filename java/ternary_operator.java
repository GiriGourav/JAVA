import java.util.Scanner;

public class ternary_operator 
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String c=(a>b)?"True":"False";
        System.out.println(c);
    }
}

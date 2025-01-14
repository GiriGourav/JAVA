import java.util.*;
public class inbuiltsort 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Integer arr[]=new Integer[6];
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<6;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

package Arraylist;
import java.util.*;
public class Lonely {
    public static int lonely(ArrayList<Integer> list)
    {
        for(int i=1;i<list.size()-1;i++)
        {
            if(list.get(i+1)!=list.get(i)+1 && list.get(i-1)!=list.get(i)-1)
            {
               System.out.print(list.get(i)+" ");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<4;i++)
        {
            list.add(sc.nextInt());
        }
        lonely(list);
    }
}

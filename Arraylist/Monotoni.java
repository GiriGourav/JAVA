package Arraylist;
import java.util.*;
public class Monotoni {
    public static String monotonic(ArrayList <Integer> list)
    {
        int cti=0;
        int ctd=0;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)<=list.get(i+1))
            {
                ctd++;
            }
            if(list.get(i)>=list.get(i+1))
            {
                cti++;
            }

        }
        if(ctd==list.size()-1 || cti==list.size()-1)
        {
            return ("YES");
        }
        else{
            return ("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> list=new ArrayList<>();
        for (int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }

        
        System.out.println(monotonic(list));
    }
    
}

package GreedyAlgorithm;

import java.lang.reflect.Array;
import java.util.*;

public class Indiancoin {
    public static void main(String[] args) {
        Integer coin[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coin,Comparator.reverseOrder());
        int countcoin=0;
        int amt=590;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coin.length;i++)
        {
            if(coin[i]<=amt)
            {
                while (coin[i]<=amt) {
                    countcoin++;
                    amt-=coin[i];
                    ans.add(coin[i]);
                }
            }
        }
        System.out.println("Total (min) coins used="+countcoin);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}

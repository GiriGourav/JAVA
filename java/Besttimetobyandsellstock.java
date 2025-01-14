import java.util.Scanner;
class Besttimetobyandsellstock {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=0;i < prices.length;i++)
        {
              for(int j=i;j<prices.length;j++)
              {
                 int cupro=prices[j]-prices[i];
                 if( cupro> profit) 
                 {
                    profit=cupro;
                 }   
              } 
        }
        return profit;
    }
}
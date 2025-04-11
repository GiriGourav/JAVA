package Stack2;

import java.util.Stack;

public class StockSpan {
     public static void stockspan(int arr[],int span[])
     {
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int j=1;j<arr.length;j++)
        {
            int currprice=arr[j];
            while(!s.isEmpty()&& currprice>arr[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty()){
                span[j]=j+1;
            }
            else{
                int prehigh=s.peek();
                span[j]=j-prehigh;
            }
            s.push(j); 
        }

     }
     public static void main(String[] args) { 
        int arr[]={100,80,60,70,60,85,100};
        int span[]=new int[arr.length];
        stockspan(arr, span);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(span[i]+" ");
        }
     }
}

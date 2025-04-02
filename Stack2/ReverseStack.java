package Stack2;
import java.util.Stack;

public class ReverseStack 
{
    public static void pushBottom(Stack<Integer> s,int data)
         {
             if(s.isEmpty())
             {
               s.push(data);
               return;
             }

             int top=s.pop();
             pushBottom(s, data);
             s.push(top);
         }
    public static void Reverse_Stack(Stack<Integer> s)
    {
       if(s.isEmpty())
       {
        return;
       }
       int top=s.pop();
       Reverse_Stack(s);
       pushBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        Reverse_Stack(s);
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
}

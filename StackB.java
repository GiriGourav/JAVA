import java.util.Stack  ;
public class StackB 
 {
    
        // static ArrayList <Integer> list=new ArrayList<>();
        // public static boolean isEmpty()
        // {
        //     return list.size()==0;
        // }
        // // push
        // public static void push(int data){
        //    list.add(data);
        // }
        // //pop
        // public static int pop()
        // {
        //     int top=list.get(list.size()-1);
        //     list.remove(list.size()-1);
        //     return top;
        // }
        // // peek
        // public static int peek()
        // {
        //     return list.get(list.size()-1);
        //  }

        // static class Node {
        //     int data;
        //     Node next;
        //     Node(int data){
        //         this.data =data;
        //         this.next=null;
        //     }
        // }
        // static class stack{
        //     static Node head=null;
        //     //is Empty   
        //     public static boolean isEmpty()
        //     {
        //         return head == null;
        //     }
        //     // push
        //     public static void push(int data)
        //     {
        //         Node newNode=new Node(data);
        //         if(isEmpty())
        //         {
        //             head=newNode;
        //             return;
        //         }
        //         newNode.next=head;
        //         head=newNode;
        //     }
        //     // pop
        //     public static int pop()
        //     {
        //         if(isEmpty())
        //         {
        //             return -1;
        //         }
        //         int top=head.data;
        //         head=head.next;
        //         return top;
        //     }
        //     // peek
        //     public static int peek()
        //     {
        //         if(isEmpty())
        //         {
        //             return -1;
        //         }
        //         return head.data;
        //     }
        // }    
// lecture-5
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
    
// lecture 6
      //   public static String Revers(String str)
      //   {
      //     Stack<Character> s=new Stack<>();
      //      int idx=0;
      //      while(idx<str.length())
      //      {
      //       s.push(str.charAt(idx));
      //       idx++;
      //      }
      //      StringBuilder result=new StringBuilder("");
      //      while(!s.isEmpty())
      //      {
      //         char curr=s.pop();
      //         result.append(curr);
      //      }

      //      return result.toString();
      //   }
      //   public static void main(String[] args) {
           
      //      String str="abc";
      //      String result= Revers(str);
      //      System.out.println(result);
      //   }
      public static void ReverseStack(Stack<Integer> s)
     {
           if(s.isEmpty())
           {
            return ;
           }
           int top=s.pop();
           ReverseStack(s);
           pushBottom(s, top);
     }
     public  static void main (String args[])
     {
         Stack<Integer> s=new Stack<>();
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);
         ReverseStack(s);
         while(!s.isEmpty())
         {
          System.out.println(s.peek());
          s.pop();
         }
     }
    }
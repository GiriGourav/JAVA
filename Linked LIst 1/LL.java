import java.util.*;
public class LL {
    public class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
       Node newNode = new Node(data);
       size++;
       if(head == null)
       {
        head=tail=newNode;
       }
       newNode.next=head;
       head=newNode;
    }

    public void addLast(int data)
    {
        Node newNode =new Node(data);
        size++;
        if(head == null)
        {
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print()
    {
        if(head ==null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node Temp=head;
        while(Temp != null)
        {
            System.out.print(Temp.data+"->");
            Temp=Temp.next;
        }
        System.out.print("null");
        System.out.println();    
    }

    public void addMid(int idx, int data)
    {
        if(idx == 0)
        {
            addFirst(data);
            return;
        }

        Node newNode =new Node(data);
        size++; 
        Node temp =head;
        int i=0;
        while(i<idx)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int RemoveFirst()
    {
        if( size==0)
        {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }

        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int ItrSearch(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
              return i;
            }
            temp=temp.next;
            i++;
        }
        return-1;
        
    }
    
    public int Helper(Node head,int key)
    {
        if( head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int idx =Helper(head.next, key);
        if(idx==-1)
        {
            return -1;
        }
        return idx+1;
    }
    public int RecurSearch(int key)
    {
        return Helper(head, key);
    }

    public void reverseLL()
    {
        Node pre=null;
        Node cur=tail= head;
        Node next;

        while (cur!=null) {
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        head=pre;
    }

    public void removenthFromEnd(int n)
    {
        int sz=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            sz++;
        }

        if(n==sz)
        {
            head=head.next;
            return;
        }

        int i=1;
        int itoFind=sz-n;
        Node pre=head;
        while (i<itoFind) {
            pre=pre.next;
            i++;
        }
        pre.next=pre.next.next;
        return;
    }
     public static void main(String[] args) {
        LL ll=new LL();
        //  ll.head=new Node(1);
        // ll.head.next=new Node(2);  
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addMid(2, 4);
        ll.print();
        ll.removenthFromEnd(3);
        ll.print();
    }
    
}
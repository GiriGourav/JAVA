// Reverese a Linked List
public class ReverseaLL {
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

    public void addFirst(int data)
    {
       Node newNode = new Node(data);
       if(head == null)
       {
        head=tail=newNode;
       }
       newNode.next=head;
       head=newNode;
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
    public static void main(String[] args) {
        ReverseaLL LL =new ReverseaLL();
        LL.addFirst(1);
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addFirst(4);
        LL.addFirst(5);
        // reverseLL();
        print();


    }
}

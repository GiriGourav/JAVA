package BinarryTree;

public class Preeorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinarryTree
    {
        static int idx=-1;
        public static Node BuildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            else{
                Node newNode= new Node(nodes[idx]);
                newNode.left=BuildTree(nodes);
                newNode.right=BuildTree(nodes);

                return newNode;
            }

        }
        public static void preorder(Node root)
        {
            if(root==null)
            {  System.out.print(-1+" ");
               return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);  
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinarryTree tree=new BinarryTree();
        Node root=tree.BuildTree(nodes);
        System.out.println(root.data);

        tree.preorder(root);
    }
}

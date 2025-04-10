public class BinaryTree {
    static class Node
    {
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
    static class Binary_Tree
    {
        static int idx=-1;
        public static Node BuildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);

            return newNode;
        }
        public static void preorder(Node root)
        {
           if(root==null)
           {
              return;
           }
           System.out.println(root.data+" ");
           preorder(root.left);
           preorder(root.right);

        }
    }

    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree tree=new Binary_Tree();
        Node root = tree.BuildTree(nodes);
        tree.preorder(root);
    }
}

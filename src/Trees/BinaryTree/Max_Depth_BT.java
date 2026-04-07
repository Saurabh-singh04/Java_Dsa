package Trees.BinaryTree;


class Node2
{
    int data;
    Node2 left;
    Node2 right;

    Node2(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}




public class Max_Depth_BT {

    public static void inOrder(Node2 root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(" "+ root.data);
        inOrder(root.right);

    }

    public static void main(String[] args) {
        Node2 root = new Node2(1);
        root.left =new Node2(4);
        root.right = new Node2(6);
        root.left.left = new Node2(4);
        root.left.right = new Node2(5);
        root.right= new Node2(3);
        root.right.left = new Node2(6);
        root.right.right = new Node2(7);
        inOrder(root);
    }

}

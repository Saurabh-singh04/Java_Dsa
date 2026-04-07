package Trees.BinaryTree;

import java.sql.SQLOutput;

class Node1
{
    int data;
    Node1(int data)
    {
        this.data = data;
    }
    Node1 left;
    Node1 right;
}
//Recursive way


public class PractiseBinaryTree {
    public static void inOrder(Node1 root)
    {
if(root == null)
{
    return;
}
inOrder(root.left);
System.out.println(root.data);
inOrder(root.right);
    }
    public static void main(String args[])
    {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);
        root.right= new Node1(3);
        root.right.left = new Node1(6);
        root.right.right = new Node1(7);
inOrder(root);




    }
}

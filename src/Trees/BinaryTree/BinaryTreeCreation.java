package Trees.BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int key)
    {
        this.data = key;
    }
}


public class BinaryTreeCreation {
    public static void inOrder(Node node)
    {
        if(node== null)
        {
            return;
        }
        inOrder(node.left);
      System.out.println(node.data);
        inOrder(node.right);
    }
    public static void preOrder(Node node)
    {
        if(node == null)
        {
            return;
        }
        System.out.println(node.data);

        // call preOrder left subtree
        preOrder(node.left);

        //call preOrder right subtree

        preOrder(node.right);
    }

    public static ArrayList<Integer> preOrderIterative(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if(root !=null)
        {
            stack.push(root);
        }
        while(!stack.isEmpty())
        {
            Node curr = stack.pop();
            result.add(curr.data);
            if (curr.right != null)
                stack.push(curr.right);
            if (curr.left != null)
                stack.push(curr.left);

        }
        return result;

    }
    public static   ArrayList<Integer> inOrderIterative(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while(curr!=null || !stack.isEmpty())
        {
             while (curr!=null)
             {
                 stack.push(curr);
                 curr = curr.left;
             }
             curr = stack.pop();
             result.add(curr.data);
             curr = curr.right;
        }
        return result;
    }
    public static ArrayList<Integer> postOrderIterative(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if(root !=null)
        {
            stack.push(root);
        }
        while(!stack.isEmpty())
        {
            Node curr = stack.pop();
            result.add(0,curr.data);
            if (curr.left != null)
                stack.push(curr.left);
            if (curr.right != null)
                stack.push(curr.right);


        }
        return result;

    }

    public static void postOrder(Node node)
    {
        if(node == null)
        {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }
    public static int MaxHeight(Node root)
    {
        if(root == null )
        {
            return 0;
        }
        int lh = MaxHeight(root.left);
//        System.out.println(root.data+" "+lh);
        int rh = MaxHeight(root.right);

        return 1 + Math.max(lh,rh);
    }

    public static int BalancedHeight(Node root)
    { 
        if(root == null )
        {
            return 0;
        }
        int lh = MaxHeight(root.left);

        int rh = MaxHeight(root.right);


        if (lh == -1 || rh == -1 || Math.abs(lh - rh) > 1) {
            return -1;
        }

        return 1 + Math.max(lh,rh);
    }
    public static int maxDiameter(Node root,int max)
    {
        if(root == null)
        {
            return 0;
        }
        int lh = maxDiameter(root.left,max);
        int rh = maxDiameter(root.right,max);
        max = Math.max(max,lh+rh);
        return 1+Math.max(lh,rh);
    }
    public static void main(String args[])
    {
        Node root = new Node(1);
        root.left = new Node(2);
      root.left.left= new Node (4);
       root.left.right = new Node(5);
        root.right = new Node(3);
       root.right.right = new Node(6);
       root.right.right.left = new Node(7);
//       root.right.right.left.left = new Node(8);
//
//        root.right.left = new Node(4);
//       root.right.left.left = new Node(5);
//        root.right.left.left.left = new Node(9);

//        root.right.left.right.right = new Node(8);


        inOrder(root);
//        preOrder(root);
//postOrder(root);

//        System.out.println(preOrderIterative(root));
//        System.out.println(inOrderIterative(root));
//        System.out.println(postOrderIterative(root));
//        System.out.println(MaxHeight(root));
       int a= BalancedHeight(root);
       if(a==-1)
       {
           System.out.println("not balance");
       }
       else
       {
           System.out.println("balance");
       }

//        int max = 0;
//        maxDiameter(root,max);
//        System.out.println(maxDiameter(root,max));



    }

}

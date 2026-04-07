//package Trees.BinaryTree;
//
//import java.util.*;
//
//class Node5 {
//    int data;
//    Node5 left, right;
//    Node5(int data) {
//        this.data = data;
//    }
//}
//
//public class Zig_Zag {
//
//    public static List<Integer> zigzagTraversal(Node5 root) {
//        List<Integer> result = new ArrayList<>();
//        if (root == null) return result;
//
//        Queue<Node5> q = new LinkedList<>();
//        q.add(root);
//        boolean leftToRight = true;
//
//        while (!q.isEmpty()) {
//            int size = q.size();
//            List<Integer> level = new ArrayList<>();
//
//            for (int i = 0; i < size; i++) {
//                Node5 curr = q.poll();
//
//                // Directly add in the correct order
//                if (leftToRight)
//                    level.add(curr.data);
//                else
//                    level.add(0, curr.data);  // insert at front
//
//                if (curr.left != null) q.add(curr.left);
//                if (curr.right != null) q.add(curr.right);
//            }
//
//            result.addAll(level);
//            leftToRight = !leftToRight; // flip direction
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//
//        System.out.println(zigzagTraversal(root));
//    }
//}

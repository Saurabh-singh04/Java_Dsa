package Trees.BinaryTree;
import java.util.LinkedList;
import java.util.Queue;




// Tree node
class Node10 {
    int data;
    Node10 left, right;

    public Node10(int item) {
        data = item;
        left = right = null;
    }
}

class LevelOrder {
    Node10 root;

    // Level Order Traversal
    void levelOrder() {
        if (root == null) return;

        Queue<Node10> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node10 current = queue.poll();
            System.out.print(current.data + " ");

            // Enqueue left child
            if (current.left != null)
                queue.add(current.left);

            // Enqueue right child
            if (current.right != null)
                queue.add(current.right);
        }
    }

    public static void main(String args[]) {
        LevelOrder tree = new LevelOrder();
        tree.root = new Node10(1);
        tree.root.left = new Node10(2);
        tree.root.right = new Node10(3);
        tree.root.left.left = new Node10(4);
        tree.root.left.right = new Node10(5);

        System.out.println("Level order traversal:");
        tree.levelOrder();  // Output: 1 2 3 4 5
    }
}

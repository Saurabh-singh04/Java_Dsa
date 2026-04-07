package LinkedList;

//Node creation
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;

    }
}
public class Creation {
    public static void main(String args[])
    {
        Node p1 = new Node(10);//Object of the node
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);

        //linking of the node
         p1.next = p2;
         p2.next = p3;
         p3.next = p4;
         Node head = p1;

        //node print
        System.out.println(head.data);
        System.out.println(p2.data);
        System.out.println(p3.data);
        System.out.println(p4.data);

    }
}

package LinkedList.PractiseLL;

 class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this. data = data;
        next =null;
    }
}
public class Practise {
    public static void main(String[] args) {


        Node h1 = new Node(4);
        Node h2 = new Node(5);
        Node h3 = new Node(6);
        h1.next = h2;
        h2.next = h3;
        h3.next = null;
        Node head = h1;
//        System.out.println(h1.data);
//        System.out.println(h2.data);
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr= curr.next;
        }

    }
}
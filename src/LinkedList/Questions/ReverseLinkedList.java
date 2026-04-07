package LinkedList.Questions;

import java.util.LinkedList;

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
class  Linked
{
    Node head;

    void traverse()
    {   Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
    void add(int a)
    {
        Node temp = new Node(a);
        if(head ==null)
        {
            head = temp;
        }
        else
        {
            Node curr = head;
            while(curr.next!= null)
            {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }
    void reverse()
    {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }
    void odd_even()
    {
        Node odd = head;
        Node even = head.next;
        Node evenNode = head.next;

        while(even!=null && even.next !=null)
        {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = odd.next;
        }
        odd.next = evenNode;
    }


}

public class ReverseLinkedList {
    public static void main(String args[])
    {
        Linked ll = new Linked();
        ll.add(1);
        ll.add(3);
        ll.add(4);
        ll.add(2);

        ll.add(5);
//        ll.add(6);

        ll.traverse();
        System.out.println();
        System.out.println("after the reverse");
//        ll.reverse();
//        ll.traverse();
        ll.odd_even();
        ll.traverse();

    }
}

package LinkedList;
//Node creation
class Node1
{
    int data;
    Node1 next;
    Node1(int data)
    {
        this.data =data;
        this.next = next;
    }
}

//Node Traversing by class
class LinkedList
{
    Node1 head;
    void PrintList()
    {
        Node1 curr = head;

        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
public class TraversalLinkedList {

    //traversing through functin
//    public static void printList(Node head)
//    {
//        Node curr = head;
//        while(curr!=null)
//        {
//            System.out.println(curr.data);
//            curr = curr.next;
//        }
//    }
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();//object creation of the class LinkedList
        Node1 head = new Node1(10);//object for Node
        Node1 p2 = new Node1(20);
        Node1 p3 = new Node1(30);
        Node1 p4 = new Node1(40);

        //linking of the node
        head.next = p2;
        p2.next = p3;
        p3.next = p4;

//        printList(head);
        ll.head = head;
        ll.PrintList();


    }
}

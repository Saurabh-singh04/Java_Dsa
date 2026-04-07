package LinkedList.RotateLL;

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
class Linked{
    Node head;
    void traverse()
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr= curr.next;

        }
    }
    void add(int e)
    {
        Node temp = new Node(e);

        if(head== null)
        {
            head = temp;

        }
        else
        {
            Node curr = head;
            while(curr.next!=null)
            {
                 curr =curr.next;
            }
            curr.next = temp;

        }
    }
    Node Rotate(int k)
    {
        if(head ==null || head.next == null)
        {
            return  head;
        }
        Node curr = head;
        int c = 1;
        while(curr.next!=null)
        {
            c++;
            curr = curr.next;
        }
        if(k%c ==0)//for the lenght rotate or square of the number
        {
            return head;
        }
        curr.next = head;

        Node temp = head;
        int count = 1;
        k = k%c;//for large rotation

        while(count<c-k)
        {
            temp = temp.next;
            count++;
        }

        head = temp.next;
        temp.next =null;
        return head;
    }
}
public class RotateLL {
    public static void main(String[] args) {
        Linked  ll = new Linked();
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(4);
        ll.add(5);


        ll.traverse();
        Node head = ll.Rotate(4);
        ll.traverse();

    }
}

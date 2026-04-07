package LinkedList.Loop;

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

class Linked
{
    Node head;
    void traverse()
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;

        }
    }

    void add(int e)
    {
        Node temp = new Node(e);
        //check for node is empty
        if(head ==null)
        {
            head = temp;
        }
        //else
        else {
            Node curr = head;
            while(curr.next!=null)
            {
                curr = curr.next;
            }
            curr.next = temp;
        }

    }
    int lenghtLoop()
    {
        if(head ==null || head.next == null)
        {
            return 0;
        }
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!= null)
        {
            fast = fast.next.next;
            slow= slow.next.next;
            if(slow == fast)//loop exist
            {
                return length(slow,fast);
            }
        }
        return  0;


    }
    int length(Node slow,Node fast)
    {
        int count =1;
                fast = fast.next;
                while(fast!=slow)
                {
                    count++;
                fast = fast.next;
                }
                return count;



    }



}
public class Length_Loop {
    public static void main(String[] args) {
        //here we not create the loop of the ll only fuction is applied
        Linked ll = new Linked();
        ll.add(5);
        ll.add(33);
        ll.traverse();
    }
}

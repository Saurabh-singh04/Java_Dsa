package LinkedList.Insertion;

class Node
{
    int data;
    Node6 next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    Node6 head;
    void traversal()
    {
        Node6 curr = head;
        while(curr!= null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    void add(int e)
    {
        Node6 temp = new Node6(e);
        if(head == null)
        {
            head = temp;
        }
        else
        {
            Node6 curr = head;
            while (curr.next!=null)
            {
                curr = curr.next;
            }
            curr.next = temp;
        }


    }
    void addFirst(int e)
    {
        Node6 temp = new Node6(e);
        if(head == null)
        {
            head = temp;
        }

        else
        {
            temp.next = head;
            head = temp;
        }


    }

    void addIndex(int e,int index)
    {
        Node6 temp = new Node6(e);
        if(index==0)
        {
            addFirst(e);
        }

        else
        {
           Node6 curr = head;
           int count =0;
           while(count<index-1)
           {
               curr = curr.next;
               count++;
           }
           temp.next = curr.next;
           curr.next = temp;

        }


    }
    void size()
    {
        Node6 curr = head;
        int count =0;
        while(curr!=null)
        {
            curr = curr.next;
            count++;
        }
        System.out.println(count);
    }
    int search(int element)
    {
        Node6 curr = head;
        int count=0;
        while(curr!=null)
        {
            if(curr.data == element)
            {
                return count;
            }
            else
            {
                curr = curr.next;
                count++;
            }
        }
        return -1;
    }
}
public class Addition_Insertion {
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.add(5);
    ll.add(55);
      ll.add(66);
       ll.addFirst(1);
     ll.addIndex(100,0);
        ll.traversal();
        ll.size();
       int a = ll.search(5);
        System.out.println(a);
    }
}

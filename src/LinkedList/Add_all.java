package LinkedList;


class Node4
{
    int data;
    Node4 next;
    Node4(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Linkeds
{
    Node4 head;
    void traverse()
    {
        Node4 curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    void add(int e)
    {
        Node4 temp = new Node4(e);//node creation
        if(head == null)//if the empty list
        {

            head = temp;
        }
        else//for the not empty list
        {
            Node4 curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = temp;

        }
    }
    void addBeginning(int e)
    {
        Node4 temp2 = new Node4(e);
        if(head==null)
        {
            head = temp2;
        }
        else
        {
            temp2.next = head;
            head = temp2;
        }
    }
    void addAll(int arr[])
    {
        for(int elemnt:arr)
        {
            add(elemnt);
        }
    }
}
public class Add_all {
    public static void main(String args[])
    {
        Linkeds ll = new Linkeds();

        ll.add(5);
        ll.add(5);
        ll.add(85);
        ll.add(59);
        ll.add(577);

        ll.addBeginning(1);

        ll.traverse();
        int arr[]={1,2,3,4,5};
        System.out.println("after the function call");
        ll.addAll(arr);
        ll.traverse();



    }
}


package LinkedList;

class NodePractise
{
    int data;
    NodePractise next;
    NodePractise(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedLists
{
    NodePractise head;
    void traversal()
    {
        NodePractise curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    void add(int e)
    {
        NodePractise temp = new NodePractise(e);

        if(head==null)
        {
            head = temp;
        }
        else
        {
            NodePractise curr = head;
            while(curr.next!=null)
            {
                curr = curr.next;
            }
            curr.next = temp;
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
public class Practise {
    public static void main(String args[])
    {
        LinkedLists l = new LinkedLists();
        l.add(5);
        l.add(55);
        l.traversal();
        int arr[]={1,2,3,4,5};
        System.out.println("after the function call");
        l.addAll(arr);
        l.traversal();

    }
}

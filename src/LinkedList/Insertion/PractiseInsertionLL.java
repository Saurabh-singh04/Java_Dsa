package LinkedList.Insertion;

 class Node6
{
    int data;
    Node6 next;

    Node6(int data)
    {
        this.data = data;
        this.next = null;
    }

}
class Insertion
{
    Node6 head;
    void add(int data)
    {
        Node6 temp = new Node6( data);
        if(head==null)
        {
head = temp;
        }
    }




}

public class PractiseInsertionLL {
    public static void main(String[] args) {
Insertion in = new Insertion();
in.add(5);


    }
}

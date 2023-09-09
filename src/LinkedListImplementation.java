// LinkedList Implementation
public class LinkedListImplementation
{
    public static void main(String[] args)
    {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        
        Traverse(head);
    }
    public static void Traverse(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }

    public static <T> void Insert(T data, Node head, int Pos )
    {
        Node toAdd = new Node<>(36);

        if(Pos == 0)
        {
            toAdd.next=head;
            head=toAdd;
        }
        Node prev = head;
        for (int i=0; i<Pos-1; i++)
            prev=prev.next;
        toAdd.next=prev.next;
        prev.next=toAdd;
    }

    public static void Delete(Node head, int Pos )
    {
        if(Pos == 0)
            head=head.next;

        Node prev = head;
        for (int i=0; i<Pos-1; i++)
            prev=prev.next;
        prev.next=prev.next.next;
    }
}

class Node <T>
{
    T data;
    Node next;
    Node(T data)
    {
        this.data = data;
    }
}

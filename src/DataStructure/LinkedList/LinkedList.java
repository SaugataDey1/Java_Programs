package DataStructure.LinkedList;

// LinkedList Implementation


public class LinkedList
{
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static LinkedList insert(int data, LinkedList list)
    {
         Node new_Node = new Node(data);

         if(list.head==null)
         {
             list.head=new_Node;
         }
         else {
             Node last = list.head;
             if(last.next!=null)
             {
                 last=last.next;
             }

             last.next=new_Node;
         }
         return list;
    }

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
        if (currNode!=null)
        {
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }



    public static void main(String[] args)
    {
          LinkedList list = new LinkedList();

        //  list = insert

    }
}

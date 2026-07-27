import java.util.*;
class ListNode 
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) 
    {
        this.val = val;
    }
    ListNode(int val, ListNode next) 
    {
        this.val = val;
        this.next = next;
    }
}

public class SinglyLinkedList
{
    static Scanner sc=new Scanner(System.in);
    public static ListNode insertBeg(ListNode head) 
    {
        System.out.println("Enter the value to be inserted at the beginning: ");
        int x=sc.nextInt();
        ListNode node=new ListNode(x);
        node.next=head;
        head=node; 
        return head;
    }

    public static ListNode insertEnd(ListNode head) 
    {
        System.out.println("Enter the value to be inserted at the end: ");
        int x=sc.nextInt();
        ListNode node=new ListNode(x);
        ListNode ptr=head;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=node;
        node.next=null;
        return head;    
    }

    public static ListNode insertPos(ListNode head) 
    {
        System.out.println("Enter the position where you want to insert the value: ");
        int k=sc.nextInt();
        System.out.println("Enter the value to be inserted: ");
        int x=sc.nextInt();
        ListNode node=new ListNode(x);
        ListNode ptr=head;
        for (int i=1; i<k-1; i++)
        {
            ptr=ptr.next;
        }
        node.next=ptr.next;
        ptr.next=node;
        return head;    
    }

    public static ListNode delBeg(ListNode head) 
    {
        head=head.next;
        return head;
    }

    public static ListNode delEnd(ListNode head) 
    {
        ListNode ptr=head;
        while(ptr.next.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=null;
        return head;    
    }

    public static ListNode delPos(ListNode head) 
    {
        System.out.println("Enter the position where you want to delete the value: ");
        int k=sc.nextInt();
        ListNode ptr=head;
        for (int i=1; i<k-1; i++)
        {
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
        return head;    
    }

    public static ListNode reverse(ListNode head) 
    {
        ListNode prev=null, curr=head;
        while (curr!=null)
        {
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;    
    }

    public static void printList(ListNode head) 
    {
        ListNode ptr=head;
        while (ptr!=null)
        {
            System.out.print(ptr.val+"-> ");
            ptr=ptr.next;
        }
        System.out.println("null");
    }

    public static ListNode update(ListNode head) 
    {
        System.out.println("Enter the position where you want to update the value: ");
        int k=sc.nextInt();
        System.out.println("Enter the new value: ");
        int x=sc.nextInt();
        ListNode ptr=head;
        for (int i=1; i<k; i++)
        {
            ptr=ptr.next;
        }
        ptr.val=x;
        return head;    
    }

    public static void main(String[] args) 
    {
        // Create: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        head = update(head);
        printList(head);
    }
}
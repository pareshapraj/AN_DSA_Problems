// https://www.geeksforgeeks.org/problems/given-a-linked-list-reverse-alternate-nodes-and-append-at-the-end/1?page=3&category=Linked%20List&sortBy=submissions


class Solution
{
     public static void rearrange(Node odd)
    {
        // add your code here
         if (odd == null || odd.next == null || odd.next.next == null) {
            
            return;
        }
         Node even =new Node(0);
        Node od =new Node(1);
        Node h1=od;
        Node h2=even;
        Node temp=odd;
        while(temp!=null){
            h1.next=temp;
            temp=temp.next;
              h1=h1.next;
            h2.next=temp;
            if(temp==null) break;
            temp=temp.next;
             h2=h2.next;
        }
       h1.next=null;
       h2.next=null;
        
        Node curr = even.next;
        Node prev = null;
        Node Next = null;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        Node x=prev; 
    
        Node t=odd.next;
        while(t.next!=null){
            t=t.next;
        }
        t.next=x;  
    }
}
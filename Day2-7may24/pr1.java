//https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1?page=1&category=Linked%20List&sortBy=submissions


class Solution
{
    int getMiddle(Node head)
    {
        if(head == null || head.next == null){
            return head.data;
        }
        Node slow= head;
        Node fast= head;
        
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
}
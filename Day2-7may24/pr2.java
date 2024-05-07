//https://www.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1?page=1&category=Linked%20List&sortBy=submissions
class Solution
{
    public static Node reverse(Node head, int k)
    {
        //Your code here
        if (head == null) {
            return null;
        }

        Node prev = null;
        Node current = head;
        Node next = null;
        int count = 0;

        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = reverse(next, k);
        }

        return prev;
    }
}

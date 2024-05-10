//https://www.geeksforgeeks.org/problems/remove-all-occurences-of-duplicates-in-a-linked-list/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions


class Solution
{
    public static Node removeAllDuplicates(Node head)
    {
        Node current= head;
        Node temp= new Node(0);
        temp.next= head;
        Node prev= temp;
        
        while(current != null){
            if(current.next != null && current.data == current.next.data){
                while(current.next != null && current.data == current.next.data){
                    current = current.next;
                }
                prev.next = current.next;
            }else{
                prev= prev.next;
            }
            current= current.next;
        }
        return temp.next;
    }
}
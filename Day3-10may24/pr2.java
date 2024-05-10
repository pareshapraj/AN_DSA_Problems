//https://www.geeksforgeeks.org/problems/length-of-longest-palindrome-in-linked-list/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions

class GfG
{
    static int solve(ArrayList<Integer> arr, int i, int j) {
       while (i >= 0 && j < arr.size() && arr.get(i)==arr.get(j)) {
           i--;
           j++;
       }
       return j - i - 1;
   }
   
   static int length(ArrayList<Integer> arr){
       int ans=0;
       for(int i=0;i<arr.size();i++){
           int len=Math.max(solve(arr,i,i),solve(arr,i,i+1));
           ans=Math.max(ans,len);
       }
       return ans;
   }
    
    
    public static int maxPalindrome(Node head)
    {
         ArrayList<Integer> arr=new ArrayList<>();
         while(head!=null){
             arr.add(head.data);
             head=head.next;
         }
         return length(arr);
    }
}
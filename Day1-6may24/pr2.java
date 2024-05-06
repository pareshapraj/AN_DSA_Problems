// https://leetcode.com/problems/rotate-array/description/

class Solution {
    public void rotate(int[] arr, int k) {
        int n= arr.length;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void reverse(int [] arr, int start, int end){
        while(start<= end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}
//https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&category=Arrays&sortBy=submissions

class Solution
{
    public static void sort012(int a[], int n)
    {
        int low=0, mid=0, high= n-1;
        
        while(mid <= high){
            if(a[mid]== 0){
                swap(a,low,mid);
                low++;
                mid++;
            }else if(a[mid] == 1){
                mid++;
            }else{
                swap(a,mid,high);
                high--;
            }
        }
    }
    
    static void swap(int a[],int low, int high){
        int temp= a[low];
        a[low]= a[high];
        a[high] = temp;
    }
}
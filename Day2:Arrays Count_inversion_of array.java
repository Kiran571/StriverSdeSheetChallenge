import java.util.* ;
import java.io.*; 
public class Solution {

    public static long mergeSort(long[]arr, int low,int high){
        int ct = 0;
        if (low >= high) return ct;
        int mid = (low + high) / 2 ;
        ct += mergeSort(arr, low, mid);  // left half
        ct += mergeSort(arr, mid + 1, high); // right half
        ct += merge(arr, low, mid, high);  // merging sorted halves
        return ct;
    }

    private static long merge(long[] arr, int low, int mid, int high) {
        int n = arr.length;
        int ct=0;

        int left = low;
        int right = mid+1;
        ArrayList<Long> temp = new ArrayList<>();

        while(left<=mid && right <=high){
            if(arr[left] <= arr[right]){

                temp.add(arr[left]);
                left++;

            }
            else{
                temp.add(arr[right]);
                ct += (mid-left+1);
                right++;

            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
        return ct;
    }


    public static long getInversions(long arr[], int n) {
        // Write your code here.
        return mergeSort(arr, 0, n - 1);
        

    }
}

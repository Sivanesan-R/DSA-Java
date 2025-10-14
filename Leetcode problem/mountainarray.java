// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/submissions/1586514345/
public class mountainarray {
    public  static void main(String [] args){
        int a[] = {1,2,3,5,6,9,11,3,2};
        System.out.println(peakIndexInMountainArray(a));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]) end = mid;
            else start = mid+1;
        }
        System.gc();
        return end;
    }
}

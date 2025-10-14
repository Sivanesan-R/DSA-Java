// https://leetcode.com/problems/merge-sorted-array/
import java.util.Arrays;

public class mergesortedarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,0,0,0};
        int [] arr2 = {2,5,6};
        merge(arr, 3, arr2, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = 0;
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[c];
            c++;
        }
        Arrays.sort(nums1);
    }
}

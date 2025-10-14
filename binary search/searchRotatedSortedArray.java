public class searchRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int val = 0;
        System.out.println(rotationarray(nums, val));
    }

    static int rotationarray(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid - 1]) {
                start = mid;
            } else {
                return nums[mid];
            }
        }
        return -1;
    }
}

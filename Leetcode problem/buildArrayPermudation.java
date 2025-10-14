// https://leetcode.com/problems/build-array-from-permutation/?envType=daily-question&envId=2025-05-06
public class buildArrayPermudation {
    public static void main(String[] args) {
        buildArrayPermudation solution = new buildArrayPermudation();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = solution.buildArray(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] buildArray(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[nums[i]];
        }
        return temp;
    }
}

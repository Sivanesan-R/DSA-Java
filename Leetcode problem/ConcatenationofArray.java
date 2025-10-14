//https://leetcode.com/problems/concatenation-of-array/description/?envType=problem-list-v2&envId=array
public class ConcatenationofArray {
    public static void main(String [] args){
        int [] arr = {1,2,1};
        int[] result = getConcatenation(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    static int[] getConcatenation(int[] nums) {
        int [] temp = new int [2*nums.length];
        for(int i : nums){
            temp[i] = nums[i];
            temp[i+nums.length] = nums[i];
        }
        return temp;
    }
}

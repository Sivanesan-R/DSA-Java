// https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;

public class productofArrayExceptSelf {
    public static viod main(String [] args){
        ina [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public int[] productExceptSelf(int[] nums) {
         int temp [] = new int [nums.length];
        int pre = 1;
        int post = 1;
        for(int i=0;i<nums.length;i++){
            temp[i] = 1; 
        }
        for(int i=0;i<nums.length;i++){
            temp[i] *= pre;
            pre *= nums[i];


            
        }
        for(int i=nums.length -1;i>=0;i--){
            temp[i] *= post;
            post *= nums[i];
        }
        return temp;
    }
}

import java.util.*;
public class show {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 5, 6 };
        int target = 2;
        int [] nums  = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        for(int i = 1; i < arr.length; i++){
            if(target == nums[i]){
                int temp = nums[i];
            }
        }
        // // nums[1] = target;
        for(int i = 0; i < nums.length; i++){
            nums[i + 1] = arr[i];
            }

        // for(int i = 0; i < nums.length; i++){
        //     System.out.print(nums[i]);
        // }

        // // for(int i = 1; i < nums.length; i++){
            
        // // }

    }
}
import java.util.*;

public class cyclesort {
        public static void main(String[] args) {
                int [] nums = {3,5,2,1,4};
                cycle(nums);
                System.out.println(Arrays.toString(nums));
        }

        static void cycle(int[] arr) {
                int i = 0;
                while (i < arr.length) {
                        int correctIndex = arr[i] - 1;
                        if (arr[i] != arr[correctIndex]) {
                                swap(arr, i, correctIndex);
                        } else {
                                i++;
                        }

                }
        }
        static void swap(int [] arr,int first,int second){
                arr[first] ^= arr[second];
                arr[second] ^= arr[first];
                arr[first] ^= arr[second];
        }
}

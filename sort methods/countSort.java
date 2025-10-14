import java.util.*;
public class countSort {
    
    public static void countsort(int [] arr){
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = arr[0];
        for (int nums : arr) {
            if (nums > max) {
                max = nums;
            }
        }

        int[] countarray = new int [max+1];
        for (int num : arr) {
            countarray[num]++;
        }
        int index = 0;

        for (int i = 0; i <= max; i++) {
            while (countarray[i] > 0) {
                arr[index] = i;
                index++;
                countarray[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {6,3,10,9,2,4,9,7};
        countsorthas(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countsorthas(int [] arr){
        if (arr == null || arr.length<=1) {
            return;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer,Integer> countmap = new HashMap<>();
        for (int nums : arr) {
            countmap.put(nums, countmap.getOrDefault(nums, 0) +1);
        }
        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = countmap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}

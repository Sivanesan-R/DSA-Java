//https://leetcode.com/problems/combination-sum-ii/description/
import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int val = 8;
        
        Arrays.sort(arr); 
        findCombinations(arr, val, 0, new ArrayList<>());
    }

    public static void findCombinations(int[] arr, int val, int start, List<Integer> combination) {
        if (val == 0) {
            System.out.println(combination);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) continue; 
            
            if (arr[i] > val) break; 
            
            List<Integer> newCombination = new ArrayList<>(combination);
            newCombination.add(arr[i]);

            findCombinations(arr, val - arr[i], i + 1, newCombination);
        }
    }
}

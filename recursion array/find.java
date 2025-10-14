import java.util.ArrayList;

public class find {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 9 };
        System.out.println(findin(arr, 4, 0,new ArrayList<>()));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findin(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if(target == arr[index]){
            list.add(index);
        }
        return findin(arr, target, index+1, list);
    }
}

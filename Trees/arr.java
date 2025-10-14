import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        System.out.println();
        // sort(arr);
        // minElement(arr);
        // search(arr);
        // reverse(arr);
        // System.out.println("reverse arrr : " + Arrays.toString(arr));
        leftrotate(arr,2);
        System.out.println("left Rotation : " + Arrays.toString(arr));
        // rightrotaion(arr,2);
        // System.out.println("right rotation : "+ Arrays.toString(arr));
    }
    static void sort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else
                    continue;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    static void minElement(int [] arr){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max Element : "+ max);
        System.out.println("min Element : "+ min);
    }

    static void search(int [] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target : ");
        int target = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("target index : " + i);
            }
        }
    }

    static void reverse(int [] arr){
        methed(arr,0,arr.length);
    }
    static int []  methed(int [] arr,int s,int e){
        if (s >= e) {
            return new int [] {0,0};
        }
        int temp = arr[s];
        arr[s]= arr[e];
        arr[e] = temp;
        return methed(arr, s++, e--);

    }

    static void leftrotate(int[] arr,int n) {
        if (n <= 0) {
            return;
        }
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        
        leftrotate(arr,n-1);
    }
    static void rightrotaion(int[] arr,int n) {
        if (n <= 0) {
            return;
        }
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        rightrotaion(arr,n-1);
    }

}

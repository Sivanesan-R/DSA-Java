import java.util.Arrays;

public class sqrtDecomposition{
    public static void main(String[] args) {
        int [] arr = {1,3,5,2,7,6,3,1,4,8};
        int n = arr.length;

        int sqrt = (int) Math.sqrt(n);
        int block_id = -1;

        int [] block = new int[sqrt+1];

        for (int i = 0; i < n; i++) {
            if (i % sqrt == 0) {
                block_id++;
            }
            block[block_id] += arr[i];
        }
        System.out.println(Arrays.toString(block));
        System.out.println(query(block, arr, 2, 7, 3));

    }

    public static int query(int[] block,int [] arr,int l,int r,int sqrt){
        int ans = 0;

        while (l % sqrt != 0 && l < r && l != 0) {
            ans += arr[l];
            l--;
        }

        while (l + sqrt <= r) {
            ans += block[l/sqrt];
            l += sqrt;
        }

        while (l <= r) {
            ans += arr[l];
            l++;
        }
        return ans;
    }

    public void update(int[] block,int [] arr,int i,int val,int sqrt){
        int block_id = i / sqrt;

        block[block_id] += (val - arr[i]);
        arr[i] = val;

    }
}
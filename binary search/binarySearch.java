public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int val = 0;
        System.out.println(solution(arr,val));
    }

    static int solution(int [] nums,int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            else if(target < nums[mid]){
                end  = mid  - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}

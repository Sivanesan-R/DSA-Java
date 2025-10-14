public class floornum {
    public static void main (String [] args){
        int[] nums = {12,23,45,56,56,56,67,79};
        int val = 44;
        System.out.println(solution(nums,val));
    }
    static int solution(int [] arr,int target){
        int start = 0;
            int end = arr.length - 1;
            boolean isacend = arr[start] < arr[end];
            while(start <= end) {
                int mid = start + (end - start) / 2;
    
                if (target == arr[mid]) {
                    return mid;
                }
                if(isacend){
                    if(target < arr[mid]){
                        end  = mid  - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
                else{
                    if(target > arr[mid]){
                        end  = mid  - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
            }
            return arr[end];
       }
}

public class orderAgnostic {
   public static void main (String [] args){
    int[] nums = { 78,67,56,45,34,32,12};
    // int nums [] = {12,23,45,56,56,56,67,79};
        int val = 12;
        System.out.println(oat(nums,val));


   }
   static int oat(int [] arr,int target){
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
        return -1;
   } 
}

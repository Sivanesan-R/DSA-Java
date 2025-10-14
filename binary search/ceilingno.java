public class ceilingno {
    public static void main (String [] args){
        char[] nums = {'c','f','j'};
        char val = 'c';
        System.out.println(solution(nums,val));
    }
    static int solution(char [] arr,char target){
        if(target > arr.length-1){
            return -1;
        }
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
            return arr[start];
       }
}

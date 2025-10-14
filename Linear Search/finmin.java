public class finmin {
    public static void main(String [] args){
        int nums [] = {29089,-4,46,5,66,34,46,435,76,878,8997,1};
        System.out.println(min(nums));
    }
    static int min(int []arr){
        if(arr.length == 0){
            return 0;
        }
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}

public class rangesearch {
    public static void main(String [] args){
        int arr [] = {2,4,46,5,66,34,46,435,76,878,8997,5433,};
        int elementtofind = 0;
        int ini = 1;
        int last = 7;
        System.out.println(linearsearch(arr,elementtofind,ini,last));
    }
    static boolean linearsearch(int [] arr,int target,int start,int end){
        if(arr.length == 0){
            return false;
        }
       for(int index = start;index < end;index++){
            if(arr[index] == target){
                return true;
            }
       }
       return false;
    }
}

public class linear{
    public static void main(String [] args){
        int arr [] = {2,4,46,5,66,};
        int elementtofind = 5;
        boolean ans = linearsearch(arr,elementtofind);
        System.out.println(ans);
    }
    static boolean linearsearch(int [] arr,int target){
        if(arr.length == 0){
            return false;
        }
       for(int index =0;index<arr.length;index++){
            if(arr[index] == target){
                return true;
            }
       }
       return false;
    }
}

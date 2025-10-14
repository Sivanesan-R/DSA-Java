public class binearSearch {
    public static void main(String[] args) {
        int arr []  ={1,2,3,4,55,89,567,789};
        int target = 55;
        System.out.println(bsearch(arr, target, 0, arr.length-1));
    }
    static int bsearch(int [] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int m = start + (end - start) / 2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            bsearch(arr, target, start, m-1);
        }
        return bsearch(arr, target, start+1, end);
    }
}

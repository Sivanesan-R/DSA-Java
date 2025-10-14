import java.util.*;
public class rowcolmatrix {
    public static void main(String [] args){
        int array[][] = {
            {10,20,30,40},
            {11,25,35,45},
            {27,28,37,49},
            {33,34,38,50},
        };
        int val = 37;
        System.out.println(Arrays.toString(matrix(array,val)));
    }
    static int[][] matrix(int[][] arr,int target){
       int r = 0;
       int  c = arr.length-1;
       while(r>c){
        if(arr[i][j] == target){
            return new int {r,c};
        }
        else if(arr[i][j] < target){
            r++;
        }
        else{
            c++;
        }
        return new int {-1,-1};
    }
}

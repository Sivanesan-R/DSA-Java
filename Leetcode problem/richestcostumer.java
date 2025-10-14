//https://leetcode.com/problems/richest-customer-wealth/

public class richestcostumer {
    public static void main (String [] args){
        int [][] arr = {{3,2,1},{1,2,3}};
        int ans = maximumWealth(arr);
        System.out.println(ans);
 
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum =0;
            for(int j=0;j<accounts[i].length;j++){
                sum  += accounts[i][j];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}

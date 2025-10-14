// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
import java.util.*;

public class sellingstock {
    public static void main(String[] args) {
        int [] arr = {3,2,6,5,0,3};
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[] prices) {
        int value = 0,max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i]<prices[j]) {
                    value = prices[j] - prices[i];
                }
                if(max<value){
                    max = value;
                }
            }
        }
        return max;
    }
}

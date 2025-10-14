//https://leetcode.com/problems/roman-to-integer/

public class Romanletter {
    public static void main (String [] args){
        String s = "MCMXCIV";
        int correct = romanToInt(s);
        System.out.println(correct);
    }
    static int romanToInt(String s) {
        int ans = 0;
        char [] arr = s.toCharArray();
        for(int i = arr.length - 1; i >= 0; i--) {
            int val = solution(arr[i]);
            if (i < arr.length - 1 && val < solution(arr[i + 1])) {
                ans -= val;
            } else {
                ans += val;
            }
        }
        return ans;
    }
    static int solution(char ch){
        switch(ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }
}

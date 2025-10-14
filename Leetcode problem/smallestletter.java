// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class smallestletter {
    public static void main (String [] args){
        char[] nums = {'c','f','j'};
        char val = 'c';
        System.out.println(solution(nums,val));
    }
    static int solution(char[] letters, char target){

            int start = 0;
            int end = letters.length - 1;
            while(start <= end) {
                int mid = start + (end - start) / 2;
    
                if(target < letters[mid]){
                    end  = mid  - 1;
                }
                else{
                    start = mid + 1;
                }

            }
            return letters[start % letters.length];
       }
}


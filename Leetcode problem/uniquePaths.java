// https://leetcode.com/problems/unique-paths/
public class uniquePaths {
    public static void main(String[] args) {
        int row = 3,column = 7;
        System.out.println(uniquePath(row, column));
    }

    static int uniquePath(int m, int n) {
        int arr [][] = new int [m][n]; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||j==0){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        
        return (arr[m-1][n-1]);
    }
}

package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class graphs {
    List<ArrayList<Integer>> list = new ArrayList<>();

    public graphs(int v){
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }

    public void printGraph(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Vertex No : " + i);
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(" " + list.get(i).get(j));
            }
            System.out.println();
        }
    }

    public int countIslands(char[][] grid) {
        int m = grid.length,n = grid[0].length;
        boolean [][] visited = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == 'L'){
                    count++;
                    dfs(grid,visited,i,j);

                }
            }

        }
        return count;
    }

    private void dfs(char[][] grid, boolean[][] visited, int i, int j) {
        visited[i][j] = true;
        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
                int nr = i+k;
                int nc = j+l;
                if(grid[nr][nc] == 'L' && !visited[i][j]){
                    dfs(grid,visited,nr,nc);
                }
            }
        }
    }
    private static class Pair<U,V>{
        public final first;
        public final second;

        public Pair(U val1,V val2){
            this.fisrt = val1;
            this.second = val2;
        }
    }

    public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Pair<Integer,Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            int sum = target - val;

            if (map.containsKey(sum)){
                list.add(new Pair<>(map.get(sum),i));
            }
            map.put(val,i);
        }
        return list;
    }

}

//package Graphs;
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int[][] graph = {
//                {0, 1, 1, 1, 0}, // Vertex 0 is connected to 1, 2, 3
//                {1, 0, 0, 0, 1}, // Vertex 1 is connected to 0, 4
//                {1, 0, 0, 1, 0}, // Vertex 2 is connected to 0, 3
//                {1, 0, 1, 0, 0}, // Vertex 3 is connected to 0, 2
//                {0, 1, 0, 0, 0}  // Vertex 4 is connected to 1
//        };
//        System.out.println("Adjacency matrix for the graph is created.");
//
//        graphs g = new graphs(5);
//
//        g.addEdge(0,1);
//        g.addEdge(2,3);
//        g.addEdge(1,2);
//        g.addEdge(3,4);
//        g.addEdge(0,4);
//        g.addEdge(1,4);
//
////        g.printGraph();
//        int n = 5;
//        List<List<Integer>> adj = new ArrayList<>();
//        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
//
//        // Example graph (undirected)
//        adj.get(0).add(1);
//        adj.get(0).add(2);
//        adj.get(1).add(0);
//        adj.get(1).add(3);
//        adj.get(2).add(0);
//        adj.get(2).add(4);
//        adj.get(3).add(1);
//        adj.get(4).add(2);
//
////        System.out.println("BFS starting from node 0:");
////        bfs(adj, 0);
//
//        ArrayList<Integer> dfs = dfs(adj);
//        System.out.println(dfs);
//
//    }
//
//        public static List<int[]> pairSum(int[] arr, int s) {
//            int i = 0,j = arr.length-1;
//            List<int[]> list = new ArrayList<>();
//            Arrays.sort(arr);
//            while(i < j){
//                int sum = arr[i] + arr[j];
//                if(sum == s){
//                    int temp = j;
//                    while(arr[i] < temp && arr[i] + arr[temp] == sum){
//                        list.add(new int[] {arr[i],arr[j]});
//                        temp--;
//                    }
//                    i++;
//
//                }
//                else if(sum > s){
//                    j--;
//                }
//                else {
//                    i++;
//                }
//
//            }
//            return list;
//        }
//
//        public static void bfs(List<List<Integer>> adj, int start) {
//            ArrayList<Integer> res = new ArrayList<>();
//            boolean[] visited = new boolean[adj.size()];
//            Queue<Integer> que = new LinkedList<>();
//
//            que.add(start);
//            visited[start] = true;
//
//            while (!que.isEmpty()) {
//                int curr = que.poll();
//                res.add(curr);
//
//                for (int x : adj.get(curr)) {
//                    if (!visited[x]) {
//                        visited[x] = true;
//                        que.add(x);
//                    }
//                }
//            }
//
//            System.out.println(res);
//        }
//
//        public static ArrayList<Integer> dfs(List<List<Integer>> adj){
//            boolean [] visited = new boolean[adj.size()];
//            ArrayList<Integer> res = new ArrayList<>();
//
//             dfsRec(adj,visited,0,res);
//             return res;
//        }
//
//        private static void dfsRec(List<List<Integer>> adj,boolean[] visited,int start,ArrayList<Integer> res){
//            visited[start] = true;
//            res.add(start);
//
//            for(int x : adj.get(start)){
//                if (!visited[x]){
//                    dfsRec(adj,visited,x,res);
//                }
//            }
//        }
//
//
//}

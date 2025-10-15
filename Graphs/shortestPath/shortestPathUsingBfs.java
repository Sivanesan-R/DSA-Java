import java.util.*;
public class shortestPathUsingBfs{
    public static void main(String[] args) {
//        System.out.println("hello");
    }
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        int [] dist = new int[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        Queue<Integer> que = new LinkedList<>();
        que.add(src);
        while (!que.isEmpty()){
            int node = que.poll();
            for(int v: adj.get(node)){
                if (dist[node] + 1 < dist[v]){
                    dist[v] = dist[node]+1;
                    que.add(v);
                }
            }
        }
        for (int i = 0; i < adj.size(); i++) {
            if (dist[i] == Integer.MAX_VALUE){
                dist[i] = -1;
            }
        }
        return dist;
    }
    public int[] shortestPath(int V, int E, int[][] edges) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new pair(v,wt));
        }
        boolean [] visited = new boolean [V];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < edges.length; i++) {
            if (!visited[i]){
                topoSort(i,visited,adj,stack);
            }
        }
        int [] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        while (!stack.isEmpty()){
            int node = stack.pop();
            if (dist[node] != Integer.MAX_VALUE){
                for (pair p : adj.get(node)) {
                    int v = p.first;
                    int wt = p.second;
                    if (dist[node] + wt < dist[v]){
                        dist[v] = wt+dist[node];
                    }
                }
            }
        }
        for (int i = 0; i < edges.length; i++) {
            if (dist[i] == Integer.MAX_VALUE){
                dist[i] = -1;
            }
        }
        return dist;
    }
    private static void topoSort(int node,boolean [] visited,ArrayList<ArrayList<pair>> adj,Deque<Integer> stack){
        visited[node] = true;
        for (pair p : adj.get(node)) {
            int v = p.first;
            if (!visited[v]){
                topoSort(v,visited,adj,stack);
            }
        }
        stack.push(node);
    }

}
class pair{
    int first,second;
    public pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}









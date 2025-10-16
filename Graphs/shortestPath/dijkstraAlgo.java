package shortestPath;

import javax.sound.sampled.Line;
import java.time.chrono.IsoEra;
import java.util.*;

public class dijkstraAlgo {
//    https://www.geeksforgeeks.org/problems/shortest-path-in-weighted-undirected-graph/1
static class Pair{
    int first;
    int second;
    Pair(int first , int second){
        this.first = first;
        this.second = second;
    }
}
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        //  Code Here.
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.first - y.first);
        int distance[] = new int[n+1];
        int parent[] = new int[n+1];

        for(int i = 0; i <= n; i++){
            distance[i] = Integer.MAX_VALUE;
            parent[i] = i;
        }

        pq.add(new Pair(0,1));
        distance[1] = 0;

        while(!pq.isEmpty()){
            Pair it = pq.peek();
            int node = it.second;
            int dis = it.first;
            pq.remove();

            for(Pair itr : adj.get(node)){
                int adjNode = itr.first;
                int w = itr.second;

                if(dis+w < distance[adjNode]){
                    distance[adjNode] = dis + w;
                    pq.add(new Pair(dis+w, adjNode));
                    parent[adjNode] = node;
                }
            }
        }
        List<Integer> path = new ArrayList<>();
        if(distance[n] == Integer.MAX_VALUE){
            path.add(-1);
            return path;
        }

        int node = n;
        while(parent[node] != node){
            path.add(node);
            node = parent[node];
        }

        path.add(1);
        path.add(distance[n]);
        Collections.reverse(path);
        return path;

    }

//    https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1

    public int[] dijkstra(int V, int[][] edges, int src) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for (int index = 0; index < edges.length; index++) {
            adj.get(edges[index][0]).add(new pair(edges[index][1],edges[index][2]));
            adj.get(edges[index][1]).add(new pair(edges[index][0],edges[index][2]));
        }
        int [] parent = new int[V];
        int [] dist = new int [V];

        for (int index = 0; index < V ; index++) {
            parent[index] = index;
            dist[index] = Integer.MAX_VALUE;
        }
        PriorityQueue<pair> pq = new PriorityQueue<pair>((x, y) -> x.first - y.first);
        pq.add(new pair(0,src));
        dist[src] = 0;
        while(!pq.isEmpty()){
            pair it = pq.poll();
            int node = it.second;
            int dis = it.first;
            for(pair iter : adj.get(node)){
                int adjNode = iter.first;
                int adjW = iter.second;
                if(dis + adjW < dist[adjNode]){
                    dist[adjNode] = dis+adjW;
                    pq.add(new pair(dist[adjNode] , adjNode));
                    parent[adjNode] = node;
                }
            }
        }
        return dist;
    }
}

import java.util.*;

public class problems {
    public static void main(String[] args) {
        // Test topoSort
        int V = 6;
        int[][] edges = {{5, 2}, {5, 0}, {4, 0}, {4, 1}, {2, 3}, {3, 1}};
        System.out.println("Topological Sort: " + topoSort(V, edges));

        // Test eventualSafeNodes
        int[][] graph = {
                {1, 2},
                {2, 3},
                {5},
                {0},
                {5},
                {},
                {}
        };
        System.out.println("Eventual Safe Nodes: " + eventualSafeNodes(graph));
    }

    // ---------- Topological Sort ----------
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
        }

        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int v : adj.get(i)) {
                indegree[v]++;
            }
        }

        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                que.add(i);
            }
        }

        ArrayList<Integer> topo = new ArrayList<>();
        while (!que.isEmpty()) {
            int node = que.poll();
            topo.add(node);

            for (int x : adj.get(node)) {
                indegree[x]--;
                if (indegree[x] == 0) {
                    que.add(x);
                }
            }
        }
        return topo;
    }

    // ---------- Eventual Safe Nodes ----------
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>> adjRev = new ArrayList<>();

        // Build reverse graph
        for (int i = 0; i < n; i++) {
            adjRev.add(new ArrayList<>());
        }

        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int v : graph[i]) {
                adjRev.get(v).add(i);
                indegree[i]++;
            }
        }

        // Kahn’s Algorithm (BFS)
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                que.add(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!que.isEmpty()) {
            int node = que.poll();
            result.add(node);

            for (int x : adjRev.get(node)) {
                indegree[x]--;
                if (indegree[x] == 0) {
                    que.add(x);
                }
            }
        }

        Collections.sort(result);
        return result;
    }
}

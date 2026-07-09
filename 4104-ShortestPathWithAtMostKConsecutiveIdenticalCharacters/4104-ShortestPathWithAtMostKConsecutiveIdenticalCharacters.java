// Last updated: 09/07/2026, 15:06:41
import java.util.*;

class Solution {

    public int shortestPath(int n, int[][] edges, String labels, int k) {
        int[][] mavorqeli = edges;

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
        }

        long INF = Long.MAX_VALUE / 4;

        long[][] dist = new long[n][k + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
        }

        PriorityQueue<State> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a.cost, b.cost));

        dist[0][1] = 0;
        pq.offer(new State(0, 1, 0));

        while (!pq.isEmpty()) {
            State cur = pq.poll();

            if (cur.cost != dist[cur.node][cur.run]) {
                continue;
            }

            if (cur.node == n - 1) {
                return (int) cur.cost;
            }

            for (int[] edge : graph[cur.node]) {
                int next = edge[0];
                int weight = edge[1];

                int newRun;

                if (labels.charAt(next) == labels.charAt(cur.node)) {
                    newRun = cur.run + 1;
                } else {
                    newRun = 1;
                }

                if (newRun > k) {
                    continue;
                }

                long newCost = cur.cost + weight;

                if (newCost < dist[next][newRun]) {
                    dist[next][newRun] = newCost;
                    pq.offer(new State(next, newRun, newCost));
                }
            }
        }

        return -1;
    }

    static class State {
        int node;
        int run;
        long cost;

        State(int node, int run, long cost) {
            this.node = node;
            this.run = run;
            this.cost = cost;
        }
    }
}
public class Solution {
    public static int networkDelayTime(int[][] times, int n, int k) {
        return Algos.maxDistInDijkstra(times, n, k);
    }
}

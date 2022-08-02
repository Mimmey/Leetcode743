import java.lang.reflect.Array;
import java.util.*;

public class Algos {

    private Algos() {
    }

    private static Integer[][] listOfDistToMatrixOfDist(int[][] dists, int n) {
        Integer[][] result = new Integer[n][n];

        result = Arrays.stream(result).map(row -> Arrays.stream(row).map(e -> -1).toArray(Integer[]::new)).toArray(Integer[][]::new);

        for (int[] dist : dists) {
            result[dist[0] - 1][dist[1] - 1] = dist[2];
        }

        return result;
    }

    public static Integer maxDistInDijkstra(int[][] times, int n, int start) {
        PriorityQueue<Label> queue = new PriorityQueue<>(Label::compareByDists);

        Integer[][] matrix = listOfDistToMatrixOfDist(times, n);
        Set<Label> labels = new HashSet<>();

        start--;

        for (int i = 0; i < n; i++) {
            Label label = new Label(i);

            if (i == start) {
                label.setDistanceFromStart(0);
                queue.add(label);
            }

            labels.add(label);
        }

        int maxDist = -1;

        while (!queue.isEmpty()) {
            Label current = queue.poll();
            int currentIndex = current.getVertexIndex();

            for (Label pretender : labels) {
                if (pretender.isVisited()) {
                    continue;
                }

                int pretenderIndex = pretender.getVertexIndex();

                if (matrix[currentIndex][pretenderIndex] > -1) {
                    pretender.setDistanceFromStart(Math.min
                            (current.getDistanceFromStart() + matrix[currentIndex][pretenderIndex],
                                    pretender.getDistanceFromStart()));
                    queue.add(pretender);
                }
            }

            current.setVisited();
        }

        for (Label label : labels) {
            if (label.isHasInfinityDistance()) {
                return -1;
            } else if (label.getDistanceFromStart() > maxDist) {
                maxDist = label.getDistanceFromStart();
            }
        }

        return maxDist;
    }
}
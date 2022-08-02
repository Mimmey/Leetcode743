import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
public class Label {
    public static int DEFAULT_DISTANCE_VALUE = Integer.MAX_VALUE;

    private final int vertexIndex;
    private boolean isVisited;
    private int distanceFromStart;
    private boolean hasInfinityDistance;

    public Label(int vertexIndex) {
        this.vertexIndex = vertexIndex;
        this.isVisited = false;
        this.distanceFromStart = DEFAULT_DISTANCE_VALUE;
        hasInfinityDistance = true;
    }

    public void setDistanceFromStart(int dist) {
        distanceFromStart = dist;
        hasInfinityDistance = false;
    }

    public void setVisited() {
        isVisited = true;
    }

    public static int compareByDists(Label label, Label t1) {
        return Integer.compare(label.distanceFromStart, t1.distanceFromStart);
    }
}

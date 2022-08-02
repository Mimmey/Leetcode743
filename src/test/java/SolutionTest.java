import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void check1() {
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4;
        int k = 2;
        Assert.assertEquals(2, Solution.networkDelayTime(times, n, k));
    }

    @Test
    public void check2() {
        int[][] times = {{1, 2, 1}};
        int n = 2;
        int k = 1;
        Assert.assertEquals(1, Solution.networkDelayTime(times, n, k));
    }

    @Test
    public void check3() {
        int[][] times = {{1, 2, 1}};
        int n = 2;
        int k = 2;
        Assert.assertEquals(-1, Solution.networkDelayTime(times, n, k));
    }

    @Test
    public void check4() {
        int[][] times = {{1,2,1},{2,3,2},{1,3,4}};
        int n = 3;
        int k = 1;
        Assert.assertEquals(3, Solution.networkDelayTime(times, n, k));
    }

    @Test
    public void check5() {
        int[][] times = {{1,2,1},{2,3,7},{1,3,4},{2,1,2}};
        int n = 4;
        int k = 1;
        Assert.assertEquals(-1, Solution.networkDelayTime(times, n, k));
    }
}

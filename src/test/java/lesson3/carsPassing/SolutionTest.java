package lesson3.carsPassing;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void returnsNumberOfCarsPassing() {
        Assert.assertEquals(5, solution.solution(new int[]{0, 1, 0, 1, 1}));
    }
}

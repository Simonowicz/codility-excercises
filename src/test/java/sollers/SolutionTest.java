package sollers;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void returnsCorrectNumberOfOnes() {
        Assert.assertEquals(3, solution.solution(3, 7));
    }
}

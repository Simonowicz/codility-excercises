package lessonTwo.maxCounters;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void returnsCorrectAnswer() {
        Assert.assertArrayEquals(new int[] {3, 2, 2, 4, 2}, solution.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4}));
    }
}

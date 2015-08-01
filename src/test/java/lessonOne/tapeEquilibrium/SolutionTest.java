package lessonOne.tapeEquilibrium;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void returnsMinimalDifference() {
        int [] inputArray = {3, 1, 2, 4, 3};
        Assert.assertEquals(1, solution.solution(inputArray));
    }
}

package lesson2.missingIntegers;

import lesson2.missingInteger.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void returnsNextValueIfAllIntegersArePresent() {
        int [] completeArray = {1};
        Assert.assertEquals(2, solution.solution(completeArray));
    }

}

package lesson3.countDiv;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void returnsZeroIfNoElementsDivisible() {
        Assert.assertEquals(0, solution.solution(7, 8, 3));
    }

    @Test
    public void returnPositiveNumberIfDivisibleElementsPresent() {
        Assert.assertEquals(3, solution.solution(5, 11, 2));
    }
}

package lessonOne.permMissingElement;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void returnsMissingElement() {
        int [] missingElementArray = {2, 3, 1, 5};
        Assert.assertEquals(4, solution.solution(missingElementArray));
    }
}

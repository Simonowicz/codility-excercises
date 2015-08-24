package lessonTwo.missingInteger;

/**
 * Created by Szymon on 2015-08-24.
 * Find smallest positive integer that's missing
 */
public class Solution {
    public int solution(int[] A) {
        boolean [] foundWithConstraints = new boolean[A.length];
        for (int a : A) {
            if (a > 0 && a <= A.length) {
                foundWithConstraints[a - 1] = true;
            }
        }

        for (int i = 0; i < foundWithConstraints.length; i++) {
            if (!foundWithConstraints[i]) {
                return i + 1;
            }
        }

        return A.length + 1;
    }
}

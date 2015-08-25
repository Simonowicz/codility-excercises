package lesson1.permMissingElement;

/**
 * Created by Szymon on 2015-08-02.
 * Perm Missing Element exercise solution
 */
public class Solution {
    public int solution(int[] A) {
        int calculatedSum = 0;
        int expectedSum = 0;

        for (int i = 0; i < A.length + 1; i++) {
            if (i < A.length) {
                calculatedSum += A[i];
            }
            expectedSum += i + 1;
        }

        return expectedSum - calculatedSum;
    }
}

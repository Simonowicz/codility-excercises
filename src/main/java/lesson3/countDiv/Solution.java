package lesson3.countDiv;

/**
 * Created by Szymon on 2015-08-25.
 * Count div solution
 */
public class Solution {
    public int solution(int A, int B, int K) {
        A = findStartingPoint(A, K);
        if (B >= A) {
            return (B - A) / K + 1;
        } else {
            return 0;
        }
    }

    private int findStartingPoint(int initialStart, int divisor) {
        int modulator = initialStart % divisor;
        if (modulator == 0) {
            return initialStart;
        } else {
            return initialStart + divisor - modulator;
        }
    }
}

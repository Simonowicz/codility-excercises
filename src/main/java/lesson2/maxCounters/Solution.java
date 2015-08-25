package lesson2.maxCounters;

/**
 * Created by Szymon on 2015-08-25.
 * Find max counters
 */
public class Solution {
    public int[] solution(int N, int[] A) {
        int [] counters = new int[N];
        int maxPerformed = 0;
        int currentMax = 0;

        for (int a : A) {
            if (a >= 1 && a <= N) {
                int newMaxCandidate = increase(counters, a - 1, maxPerformed);
                if (newMaxCandidate > currentMax) {
                    currentMax = newMaxCandidate;
                }
            } else if (a == N + 1) {
                maxPerformed = currentMax;
            }
        }

        if (maxPerformed > 0) {
            for (int i = 0; i < counters.length; i++) {
                if (counters[i] < maxPerformed) {
                    counters[i] = maxPerformed;
                }
            }
        }

        return counters;
    }

    private int increase(int [] counters, int position, int maxPerformed) {
        if (counters[position] < maxPerformed) {
            counters[position] = maxPerformed + 1;
        } else {
            counters[position] += 1;
        }
        return counters[position];
    }
}

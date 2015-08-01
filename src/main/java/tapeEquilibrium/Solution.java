package tapeEquilibrium;

/**
 * Created by Szymon on 2015-08-01.
 * Tape Equilibrium exercise solution
 */
public class Solution {
    public int solution(int[] A) {
        int[] sumUpToElementArray = new int[A.length - 1];
        int totalSum = countPartialSumsAndTotalSum(A, sumUpToElementArray);
        return findMinimalDifference(sumUpToElementArray, totalSum);
    }

    /**
     * @param A                   array of integers for which a "perfect" split needs to be found
     * @param sumUpToElementArray array of integers containing partial sum of integers from array A up to the index of each array element
     * @return total sum of all integers from A array
     */

    private int countPartialSumsAndTotalSum(int[] A, int[] sumUpToElementArray) {
        int totalSum = 0;
        for (int i = 0; i < A.length - 1; i++) {
            totalSum += A[i];
            sumUpToElementArray[i] = totalSum;
        }
        totalSum += A[A.length - 1];
        return totalSum;
    }

    private int findMinimalDifference(int[] sumUpToElementArray, int totalSum) {
        int minimalDifference = Integer.MAX_VALUE;
        for (int sumUpToElement : sumUpToElementArray) {
            int currentDifference = Math.abs(2 * sumUpToElement - totalSum);
            if (currentDifference < minimalDifference) {
                minimalDifference = currentDifference;
            }
        }
        return minimalDifference;
    }
}

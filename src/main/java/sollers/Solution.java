package sollers;

/**
 * Created by Szymon on 2015-08-24.
 * Random Sollers recruiting task
 */
class Solution {
    public int solution(int A, int B) {
        long product = A * B;
        int count = 0;
        int maximumPower = findMaximumPower(product, 0);
        for (int i = maximumPower; i >= 0; i--) {
            if (powerOfTwoFitsIntoCurrentProduct(product, i)) {
                count++;
                product -= Math.pow(2, i);
            }
        }
        return count;
    }

    private int findMaximumPower(long product, int power) {
        if (Math.pow(2, power) > product) {
            return power;
        } else {
            return findMaximumPower(product, power + 1);
        }
    }

    private boolean powerOfTwoFitsIntoCurrentProduct(long currentProduct, int powerOfTwo) {
        return Math.pow(2, powerOfTwo) <= currentProduct;
    }
}
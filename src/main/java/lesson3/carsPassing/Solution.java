package lesson3.carsPassing;

/**
 * Created by Szymon on 2015-08-25.
 * Cars passing solution
 */
public class Solution {
    public int solution(int[] A) {
        int carsPassing = 0;
        int goingEastSoFar = 0;
        for (int a : A) {
            if (a == 0) {
                goingEastSoFar++;
            } else {
                carsPassing += goingEastSoFar;
            }
        }
        return carsPassing <= 1000000000 ? carsPassing : -1 ;

    }
}

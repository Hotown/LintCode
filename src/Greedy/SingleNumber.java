package Greedy;

/**
 * Created by Hotown on 17/5/27.
 */
public class SingleNumber {
    /**
     * @param A : an integer array
     *          return : a integer
     */
    public int singleNumber(int[] A) {
        // Write your code here
        if(A == null || A.length == 0) {
            return 0;
        }

        int res = 0;
        for (int i = 0; i < A.length; i++) {
            res = res ^ A[i];
        }
        return res;
    }
}

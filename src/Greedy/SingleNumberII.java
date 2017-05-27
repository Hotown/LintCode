package Greedy;

/**
 * Created by Hotown on 17/5/27.
 */
public class SingleNumberII {
    /**
     * @param A : An integer array
     * @return : An integer
     */
    public int singleNumberII(int[] A) {
        // write your code here
        /**
         * 出现一次的数能保存在ones，出现两次保存在twos，三次清零。
         */
        int n = A.length;
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < n; i++) {
            ones = (ones ^ A[i]) & (~twos);
            twos = (twos ^ A[i]) & (~ones);
        }
        return ones;
    }
}

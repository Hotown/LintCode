package DP.BackPack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hotown on 17/5/20.
 */
public class MinAdjustmentCost {
    /**
     * @param A:      An integer array.
     * @param target: An integer.
     */
    public int MinAdjustmentCost(ArrayList<Integer> A, int target) {
        // write your code here
        int len = A.size();
        int ans = Integer.MAX_VALUE;
        int[][] result = new int[len][101];

        for (int i = 0; i < 101; i++) {
            result[0][i] = Math.abs(A.get(0) - i);
        }

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < 101; j++) {
                result[i][j] = Integer.MAX_VALUE;
                int dif = Math.abs(A.get(i) - j);
                int max = Math.min(100, j + target);
                int min = Math.max(0, j - target);
                for (int k = min; k <= max; k++) {
                    result[i][j] = Math.min(result[i][j], result[i - 1][k] + dif);
                }
            }
        }

        for (int i = 0; i < 101; i++) {
            ans = Math.min(ans, result[len - 1][i]);
        }

        return ans;
    }
}


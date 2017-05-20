package DP.BackPack;

/**
 * Created by Hotown on 17/5/13.
 */
public class BackPackII {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A  & V: Given n items with size A[i] and value V[i]
     * @return: The maximum value
     * 典型的01背包问题
     */
    public int backPackII(int m, int[] A, int V[]) {
        int len = A.length;
        int[] result = new int[m + 1];
        for (int i = 0; i < len; i++) {
            for (int j = m; j >= A[i]; j--) {
                int temp = result[j - A[i]] + V[i];
                result[j] = Math.max(result[j], temp);
            }
        }
        return result[m];
    }
}

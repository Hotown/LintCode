package DP.BackPack;

/**
 * Created by Hotown on 17/5/13.
 */
public class BackPack {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
        int len = A.length;
        int[] result = new int[m + 1];
        for (int i = 0; i < len; i++) {
            for (int j = m; j >= A[i]; j--) {
                int temp = result[j - A[i]] + A[i];
                result[j] = Math.max(result[j], temp);
            }
        }
        return result[m];
    }
}

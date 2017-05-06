package BitOperation;

/**
 * Created by Hotown on 17/5/6.
 */
public class UpdateBits {
    /**
     * @param n, m: Two integer
     * @param i, j: Two bit positions
     *           return: An integer
     */
    public int updateBits(int n, int m, int i, int j) {
        return ((~((((-1) << (31 - j)) >>> (31 - j + i)) << i)) & n) | (m << i);
    }
}

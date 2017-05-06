package BitOperation;

/**
 * Created by Hotown on 17/5/6.
 */
public class CheckPowerOf2 {
    /**
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        /**
         * 首先是要排除0，其次要排除掉负数
         */

        if (n == 0) {
            return false;
        } else if (n < 0) {
            return false;
        } else if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

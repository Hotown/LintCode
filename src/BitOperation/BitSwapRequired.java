package BitOperation;

/**
 * Created by Hotown on 17/5/6.
 */
public class BitSwapRequired {
    /**
     * @param a, b: Two integer
     *           return: An integer
     */
    public int bitSwapRequired(int a, int b) {
        int num = a ^ b;
        int count = 0;
        while (true) {
            if (num == 0) {
                break;
            }
            num = num & (num - 1);
            count = count + 1;
        }
        return count;
    }
}

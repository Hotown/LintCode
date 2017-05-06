package BitOperation;

/**
 * Created by Hotown on 17/5/6.
 */
public class CountOnes {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
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

package Greedy;

import java.util.ArrayList;

/**
 * Created by Hotown on 17/5/27.
 */
public class MinSubArray {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        // write your code
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0, length = nums.size(); i < length; i++) {
            sum += nums.get(i);
            min = Math.min(min, sum);
            sum = Math.min(sum, 0);
        }
        return min;
    }
}

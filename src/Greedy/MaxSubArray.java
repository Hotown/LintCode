package Greedy;

/**
 * Created by Hotown on 17/5/27.
 */
public class MaxSubArray {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0, length = nums.length; i < length; i++) {
            sum = sum + nums[i];
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }
        return max;
    }
}

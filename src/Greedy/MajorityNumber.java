package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Hotown on 17/5/27.
 */
public class MajorityNumber {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        Object[] numsCopy = nums.toArray();
        Arrays.sort(numsCopy);
        int length = numsCopy.length;

        return (int) numsCopy[(length - 1) / 2];
    }

}

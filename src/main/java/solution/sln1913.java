package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 两个数对之间的最大乘积差
 * @date 2024-11-4 13:09:12
 */
public class sln1913 {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n -1]*nums[n -2] - nums[0] * nums[1];
    }
}

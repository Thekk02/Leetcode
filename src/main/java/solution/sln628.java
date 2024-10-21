package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 三个数的最大乘积
 * @date 2024-10-21 16:31:52
 */
public class sln628 {
    public int maximumProduct(int[] nums) {
        int length = nums.length;
        if(length < 3){
            return 0;
        }
        Arrays.sort(nums);
        return Math.max((nums[0] * nums[1] * nums[length - 1]),(nums[length - 1] * nums[length -2] * nums[length -3]));
    }
}

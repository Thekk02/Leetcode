package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 最小差值1
 * @date 2024-11-4 08:45:28
 */
public class sln908 {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[nums.length - 1] - nums[0] <= 2 * k){
            return 0;
        }else {
            return nums[nums.length - 1] - nums[0] - 2*k;
        }
    }
}

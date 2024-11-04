package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 长度最小的子数组
 * @date 2024-10-29 10:02:14
 */
public class sln209 {
    public int minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int sum = 0;
        for(int i = nums.length - 1;i>=0;i--){
            sum += nums[i];
            ans += 1;
            if(sum >= target){
                return ans;
            }
        }
        return 0;
    }
}

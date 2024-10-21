package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 最小差值2
 * @date 2024-10-21 08:10:37
 */
public class sln910 {
    public int smallestRangeII(int[] nums, int k) {
        int l = nums.length;
        Arrays.sort(nums);
        int ans = nums[l - 1] - nums[0];
        for(int i = 0;i < l - 1;i++){
            int a = nums[i],b = nums[i+1];
            int high = Math.max(nums[l-1] - k,a + k);
            int low = Math.min(nums[0] + k,b - k);
            ans = Math.min(ans,high - low);
        }
        return ans;
    }
}

package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 学生分数的最小差值
 * @date 2024-11-1 09:15:14
 */
public class sln1984 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i + k -1 <nums.length;i++){
            ans = Math.min(ans,nums[i + k -1] - nums[i]);
        }
        return ans;
    }
}

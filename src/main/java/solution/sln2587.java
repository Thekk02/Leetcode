package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 重排数组以得到最大前缀分数
 * @date 2024-11-6 09:49:12
 */
public class sln2587 {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        long prefix=0;
        for(int i = nums.length - 1;i >= 0;i--){
            prefix += nums[i];
            if(prefix > 0){
                ans++;
            }
        }
        return ans;
    }
}

package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 采购方案
 * @date 2024-11-1 13:13:23
 */
public class LCP28 {
    public int purchasePlans(int[] nums, int target) {
        int mod = 1000000007;
        int ans = 0;
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        while(left < right){
            if(nums[left] + nums[right] > target){
                right--;
            }
            else{
                ans += right - left;
                left++;
            }
            ans %= mod;
        }
        return ans % mod;
    }
}

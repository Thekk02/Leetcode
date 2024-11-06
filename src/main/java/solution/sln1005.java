package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description k次取反后最大化的数组和
 * @date 2024-10-24 15:39:37
 */
public class sln1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < 0&& k > 0){
                nums[i] = -1 * nums[i];
                k--;
            }
            sum += nums[i];
        }
        Arrays.sort(nums);
        return sum - (k % 2 == 0? 0 : 2 * nums[0]);
    }
}

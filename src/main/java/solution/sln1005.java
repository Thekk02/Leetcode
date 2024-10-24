package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description k次取反后最大化的数组和
 * @date 2024-10-24 15:39:37
 */
public class sln1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        Arrays.sort(nums);
        if(nums[0] < 0){

        }
        return 0;
    }
}

package solution;

/**
 * @author kk
 * @description 子数组最大平均数1
 * @date 2024-10-24 10:24:23
 */
public class sln643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0;i < k;i++){
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i = k;i < n;i++){
            sum  = sum - nums[i - k] + nums[i];
            maxSum = Math.max(sum,maxSum);
        }
        return 1.0*maxSum / k;
    }
}

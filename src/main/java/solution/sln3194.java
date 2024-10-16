package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 最小元素和最大元素的最小平均值
 * @date 2024-10-16 09:45:38
 */
public class sln3194 {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Double min = Double.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0;i < n/2;i++){
            min = Math.min((double)(nums[i] + nums[n - 1 -i]) ,min);
        }
        return min / 2;
    }
}

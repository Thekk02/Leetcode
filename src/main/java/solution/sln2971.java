package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 找到最大周长的多边形
 * @date 2024-11-6 10:39:43
 */
public class sln2971 {
    public long largestPerimeter(int[] nums) {
        long sum = Arrays.stream(nums).sum();
        Arrays.sort(nums);
        for(int i = nums.length - 1;i >=0;i--){
            if(sum > 2 * nums[i]){
                return sum;
            }else{
                sum -= nums[i];
            }
        }
        return -1;
    }
}

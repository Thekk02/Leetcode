package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 有序数组的平方
 * @date 2024-10-28 15:12:16
 */
public class sln977 {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            ans[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(ans);
        return ans;
    }
}

package solution;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author kk
 * @description 最小数字游戏
 * @date 2024-7-10 10:10:17
 */
public class sln2974 {
    public int[] numberGame(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 1; i+=2){
            ans[i] = nums[i+1];
            ans[i+1] = nums[i];
        }
        return ans;
    }
}

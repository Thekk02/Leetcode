package solution;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author kk
 * @description 长度为k的子数组的能量值
 * @date 2024-11-6 10:53:59
 */
public class sln3254 {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[nums.length + 1 - k];
        Arrays.fill(ans,-1);
        for(int i = 0;i + k <nums.length - 1;i++){
            boolean flag = true;
            for(int j = i+1;j  < i + k ;j++){
                if(nums[j] - nums[j -1] != 1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans[i] = nums[i + k - 1];
            }
        }
        return ans;
    }
}

package solution;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author kk
 * @description 最长和谐子序列
 * @date 2024-10-23 13:47:28
 */
public class sln594 {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int begin  = 0;
        int res = 0;
        for(int end =0;end < nums.length;end++){
            while(nums[end] - nums[begin] > 1){
                begin++;
            }
            if(nums[end] - nums[begin] == 1){
                res = Math.max(res,end-begin+1);
            }
        }
        return res;
    }
}

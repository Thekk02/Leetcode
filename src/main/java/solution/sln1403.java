package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kk
 * @description 非递增顺序的最小子序列
 * @date 2024-11-4 10:31:39
 */
public class sln1403 {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        Arrays.sort(nums);
        List<Integer> ans = new LinkedList<>();
        int curr = 0;
        for(int i = nums.length - 1;i >=0;i--){
            ans.add(nums[i]);
            curr += nums[i];
            if(curr > sum - curr){
                return ans;
            }
        }
        return ans;
    }
}

package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 汇总区间
 * @date 2024-10-25 10:12:04
 */
public class sln228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int start=0;
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i+1] - nums[i] > 1){
                ans.add(String.valueOf(nums[start]) + "->" +String.valueOf(nums[i]));
                start = i + 1;
            }
        }
        return ans;
    }
}

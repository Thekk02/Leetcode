package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kk
 * @description 找出数组排序后的目标下标
 * @date 2024-11-4 13:11:44
 */
public class sln2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }
}

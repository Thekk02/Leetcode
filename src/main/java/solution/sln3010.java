package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 将数组分成最小总代价的子数组1
 * @date 2024-11-6 09:01:05
 */
public class sln3010 {
    public int minimumCost(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int length = nums.length;
        int dl = length;
        for(int i =0 ;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        int ans[] = new int[map.size()];
        int p = 0;
        for(int num :map.values()){
            ans[p++] = num;
        }
        Arrays.sort(ans);
        int res = 0;
        for(int i = nums.length - 1;i >=0;i--){
            dl -= nums[i];
            res ++;
            if(2 * dl <= length){
                return res;
            }
        }
        return res;
    }
}

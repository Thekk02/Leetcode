package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 存在重复元素
 * @date 2024-6-19 14:50:50
 */
public class sln219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n = nums.length;
        for(int i = 0;i < n;i++){
            int num = nums[i];
            if(map.containsKey(num) && i - map.get(num) <= k){
                return true;
            }
            map.put(num,i);
        }
        return false;
    }
}

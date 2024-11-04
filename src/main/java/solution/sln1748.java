package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 唯一元素的和
 * @date 2024-10-28 10:46:17
 */
public class sln1748 {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ans += entry.getKey();
            }
        }
        return ans;
    }
}

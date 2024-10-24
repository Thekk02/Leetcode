package solution;

import java.util.*;

/**
 * @author kk
 * @description 多数元素2
 * @date 2024-10-24 11:06:47
 */
public class sln229 {
    public List<Integer> majorityElement(int[] nums) {
        int size = nums.length;
        Set<Integer> ans = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< size;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            if( 3*map.get(nums[i]) > size){
                ans.add(nums[i]);
            }
        }
        return  Arrays.asList(ans.toArray(new Integer[0]));
    }
}

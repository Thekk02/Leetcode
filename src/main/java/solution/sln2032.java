package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kk
 * @description 至少在两个数组中出现的值
 * @date 2024-10-28 10:55:20
 */
public class sln2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums1.length;i++){
            map.put(nums1[i],1);

        }
        for(int i = 0;i < nums2.length;i++){
            map.put(nums2[i],map.getOrDefault(nums2[i],0) | 2);

        }
        for(int i = 0;i < nums3.length;i++){
            map.put(nums3[i],map.getOrDefault(nums3[i],0) | 4);

        }
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() >= 2){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}

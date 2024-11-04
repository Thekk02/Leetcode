package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 两个数组的交集2
 * @date 2024-10-23 09:16:18
 */
public class sln350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
            Map<Integer,Integer> map = new HashMap<>();
            for(int num : nums1){
                int count = map.getOrDefault(num,0)+1;
                map.put(num,count);
            }
            int[] intersetion = new int[nums1.length];
            int index = 0;
            for(int num : nums2){
                int count = map.getOrDefault(num,0);
                if(count > 0){
                    intersetion[index++] = num;
                    count--;
                }
                if(count > 0){
                    map.put(num,count);
                }else{
                    map.remove(num);
                }
            }
        return Arrays.copyOfRange(intersetion,0,index);
    }
}

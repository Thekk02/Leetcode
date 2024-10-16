package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 找到两个数组中的公共元素
 * @date 2024-10-15 09:09:43
 */
public class sln2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int[] ans = new int[2];
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        for(int num : nums1){
            if(set2.contains(num));
            ans[0]++;
        }
        for(int num : nums2){
            if(set1.contains(num));
            ans[1]++;
        }
        return ans;
    }
}

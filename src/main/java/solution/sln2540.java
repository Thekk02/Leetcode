package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 最小公共值
 * @date 2024-11-1 13:07:28
 */
public class sln2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        int ans = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int num:nums1){
                set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                ans = Math.min(ans,num);
            }
            else{
                set.add(num);
            }
        }
        return ans;
    }
}

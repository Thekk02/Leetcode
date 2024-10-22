package solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author kk
 * @description 两个数组的交集
 * @date 2024-10-22 08:50:47
 */
public class sln349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for(int i =0 ; i < nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j = 0;j < nums2.length;j++){
            if(set.contains(nums2[j])){
                ans.add(nums2[j]);
            }
        }
        int[] an = new int[ans.size()];
        int i = 0;
        for(int num: ans){
            an[i++] = num;
        }
        return an;
    }
}

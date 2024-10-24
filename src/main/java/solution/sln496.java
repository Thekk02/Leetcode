package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 下一个更大元素
 * @date 2024-10-24 11:34:23
 */
public class sln496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length,n = nums2.length;
        int[] ans = new int[m];
        for(int i = 0;i < m;i++){
            int j =0;
            while(j < n && nums2[j] != nums1[i]){
                j++;
            }
            int k = j+1;
            while(k < n && nums2[k] <= nums2[j]){
                k++;
            }
            ans[i] = k < n ? nums2[k]:-1;
        }
        return ans;
    }
}

package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 最小k个数
 * @date 2024-11-4 13:21:26
 */
public class ms1714 {
    public int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ans = new int[k];
        for(int i =0;i < k;i++){
            ans[i] = arr[i];
        }
        return ans;
    }
}

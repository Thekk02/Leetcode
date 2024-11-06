package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 减小和重新排列数组后的最大元素
 * @date 2024-11-6 09:55:57
 */
public class sln1846 {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        for(int i = 1;i < arr.length ;i++){
            arr[i] = Math.min(arr[i],arr[i - 1] + 1);
        }
        return arr[arr.length - 1];
    }
}

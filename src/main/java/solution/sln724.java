package solution;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author kk
 * @description 寻找数组的中心下标
 * @date 2024-10-15 09:22:19
 */
public class sln724 {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            if(2 * sum + nums[i] == total){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}

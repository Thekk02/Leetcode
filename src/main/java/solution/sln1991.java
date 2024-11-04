package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 找出数组的中间位置
 * @date 2024-11-1 09:22:45
 */
public class sln1991 {
    public int findMiddleIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int left = 0;
        for(int i = 0;i < nums.length;i++){
            if(2 * left + nums[i] == sum){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }

}

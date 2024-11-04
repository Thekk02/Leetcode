package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 错误的集合
 * @date 2024-10-25 10:59:39
 */
public class sln645 {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            if(i + 1 != nums[i]){
                return new int[]{nums[i],i+1};
            }
        }
        return null;
    }
}

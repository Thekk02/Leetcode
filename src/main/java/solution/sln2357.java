package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 使数组中所有元素都等于零
 * @date 2024-10-24 09:13:32
 */
public class sln2357 {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int index = 0;
        int lenght = nums.length;
        for(int i = 0;i < lenght;i++){
            if(nums[i] > 0){
                subtract(nums,nums[i],i);
                ans++;
            }
        }
        return ans;
    }
    public void subtract(int[] nums,int x,int statIndex){
        int length = nums.length;
        for(int i = statIndex;i < length;i++){
            nums[i] -= x;
        }
    }
}

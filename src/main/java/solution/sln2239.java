package solution;

/**
 * @author kk
 * @description 找到最接近0的数字
 * @date 2024-11-1 09:51:43
 */
public class sln2239 {
    public int findClosestNumber(int[] nums) {
        int diff = Math.abs(nums[0]);
        int ans = nums[0];
        for(int i = 0;i < nums.length;i++){
            if(Math.abs(nums[i]) < diff){
                diff = Math.abs(nums[i]);
                ans = nums[i];
            }
            if(Math.abs(nums[i]) == diff){
                ans = Math.max(ans,nums[i]);
            }
        }
        return ans;
    }
}

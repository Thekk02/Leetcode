package solution;

/**
 * @author kk
 * @description 增量元素之间的最大差值
 * @date 2024-11-1 09:34:25
 */
public class sln2016 {
    public int maximumDifference(int[] nums) {
        int ans = -1,Premin = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(nums[i] > Premin){
                ans = Math.max(ans,nums[i] - Premin);
            }else{
                Premin = nums[i];
            }
        }
        return ans;
    }
}

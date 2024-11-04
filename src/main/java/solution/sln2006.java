package solution;

/**
 * @author kk
 * @description 差的绝对值为k的数对数目
 * @date 2024-11-1 09:27:52
 */
public class sln2006 {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
         for(int i = 0;i < nums.length;i++){
             for(int j = i+1;j < nums.length;j++){
                 if(Math.abs(nums[i] - nums[j]) == k){
                     ans += 1;
                 }
             }
         }
         return ans;
    }
}

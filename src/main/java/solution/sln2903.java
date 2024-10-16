package solution;

/**
 * @author kk
 * @description 找出满足差值条件的下标1
 * @date 2024-10-15 08:12:33
 */
public class sln2903 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] ans = new int[]{-1,-1};
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                if(Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}

package solution;

/**
 * @author kk
 * @description 数组串联
 * @date 2024-11-1 08:52:05
 */
public class sln1929 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for(int i = 0;i < nums.length;i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}

package solution;

/**
 * @author kk
 * @description 数组元素积的符号
 * @date 2024-11-4 08:49:04
 */
public class sln1822 {
    public int arraySign(int[] nums) {
        int ans = 1;
        for(int i =0 ;i < nums.length;i++){
            if(nums[i] < 0){
                ans *= -1;
            }if(nums[i] == 0){
                return 0;
            }
        }
        return ans;
    }
}

package solution;

/**
 * @author kk
 * @description 按奇偶排序数组2
 * @date 2024-10-28 08:33:24
 */
public class sln922 {
    public int[] sortArrayByParityII(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        int left = 0,right =length - 1;
        for(int i = 0;i < length;i++){
            if(nums[i] % 2 == 0){
                ans[left] = nums[i];
                left += 2;
            }else{
                ans[right] = nums[i];
                right -= 2;
            }
        }
        return ans;
    }
}

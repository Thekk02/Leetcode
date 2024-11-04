package solution;

/**
 * @author kk
 * @description 按奇偶排序数组
 * @date 2024-10-28 08:28:20
 */
public class sln905 {
    public int[] sortArrayByParity(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        int left = 0,right = length - 1;
        for(int i = 0;i < length ;i++){
            if(nums[i] % 2 == 0){
                ans[left] = nums[i];
                left++;
            }else{
                ans[right] = nums[i];
                right--;
            }
        }
        return ans;
    }

}

package solution;

/**
 * @author kk
 * @description 在排序数组中查找元素的第一个和最后一个位置
 * @date 2024-11-5 16:49:46
 */
public class sln34 {
    public int[] searchRange(int[] nums, int target) {
        int l = 0,r = nums.length - 1;
        while(l <= r){
            int m = (l + r) /2;
            if(nums[m] >= target){
                r =m;
            }
            if(nums[m] <= target){
                l = m;
            }
            if(nums[l] == nums[r]&&nums[l] == target){
                return new int[]{l,r};
            }
        }
        return new int[]{l,r};
    }
}

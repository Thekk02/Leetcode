package solution;

/**
 * @author kk
 * @description:删除有序数组中的重复项2（每个重复的值可以出现两次）
 * 此处提供一种更简洁的解决方法，利用每次变化的值的位置作为指针，
 * @date 2024-6-19 13:26:35
 */
public class sln80 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int num:nums){
            if(i < 2 || num > nums[i - 2]){
                 nums[i++] = num;
            }
        }
        return i;
    }
}

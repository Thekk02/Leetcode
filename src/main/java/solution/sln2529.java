package solution;

/**
 * @author kk
 * @description 正整数和负整数的最大计数
 * @date 2024-11-4 08:12:07
 */
public class sln2529 {
    public int maximumCount(int[] nums) {
        int pos1 = lowerBound(nums,0);
        int pos2 = lowerBound(nums,1);
        return Math.max(pos1,nums.length - pos2);
    }
    public int lowerBound(int[] nums,int val){
        int l = 0,r = nums.length;
        while(l < r){
            int m = (l + r) /2;
            if(nums[m] >= val){
                r = m;
            }else{
                l = m;
            }
        }
        return l;
    }
}

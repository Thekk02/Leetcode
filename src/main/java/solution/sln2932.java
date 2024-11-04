package solution;

/**
 * @author kk
 * @description 找出强数对的最大异或值1
 * @date 2024-10-29 10:17:13
 */
public class sln2932 {
    public int maximumStrongPairXor(int[] nums) {
        int length = nums.length;
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i < length;i++){
            for(int j = i;j < length;j++){
                if(helper(nums[i],nums[j])){
                    ans = ans > (nums[i] ^ nums[j]) ? ans : (nums[i] ^ nums[j]);
                }
            }
        }
        return ans;
    }
    public boolean helper(int x ,int y){
        if(Math.abs(x - y) <= Math.min(x,y)){
            return true;
        }
        else{
            return false;
        }
    }
}

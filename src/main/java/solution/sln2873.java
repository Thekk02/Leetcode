package solution;

/**
 * @author kk
 * @description 有序三元组中的最大值
 * @date 2024-7-10 09:34:34
 */
public class sln2873 {
    public long maximumTripletValue(int[] nums) {
        int length = nums.length;
        long ans = 0;
        for(int i = 0;i < length;i++){
            for(int j = i+1;j < length;j++){
                for(int k = j + 1;k < length;k++){
                    if(ans < (nums[i] - nums[j]) * nums[k]){
                        ans = (long)(nums[i] - nums[j]) * nums[k];
                    }
                }
            }
        }
        return ans;
    }
}

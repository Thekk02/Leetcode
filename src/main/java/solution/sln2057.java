package solution;

/**
 * @author kk
 * @description 值相等的最小索引
 * @date 2024-10-21 09:46:26
 */
public class sln2057 {
    public int smallestEqual(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            if(i % 10 == nums[i]){
                return i;
            }
        }
        return -1;
    }
}

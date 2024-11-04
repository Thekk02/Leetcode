package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 找出数组的最大公约数
 * @date 2024-11-1 09:08:20
 */
public class sln1979 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return Max(nums[nums.length - 1],nums[0]);
    }
    public int Max(int x,int y){
        if(x % y == 0){
            return y;
        }
        else{
            return Max(y,x%y);
        }
    }
}

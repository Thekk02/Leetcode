package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 判断是否可以赢得数字游戏
 * @date 2024-10-16 13:44:57
 */
public class sln3232 {
    public boolean canAliceWin(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int sum1=0,sum2 = 0;
        for(int i = 0; i < nums.length; ++i){
            if( nums[i] <10){
                sum1 += nums[i];
            }
            else{
                sum2 += nums[i];
            }
        }
        return sum1 != sum2;
    }
}

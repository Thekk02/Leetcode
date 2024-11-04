package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 执行操作可获得的最大总奖励1
 * @date 2024-10-25 08:53:50
 */
public class sln3180 {
    public int maxTotalReward(int[] rewardValues) {
        int ans = 0;
        int length = rewardValues.length;
        Arrays.sort(rewardValues);
        for(int i = 0;i < length - 1;i++){
            if(rewardValues[i] > ans){
                ans += rewardValues[i];
            }
        }
        return ans;
    }
}

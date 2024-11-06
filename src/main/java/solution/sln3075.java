package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 幸福值最大化的选择方案
 * @date 2024-11-6 09:27:52
 */
public class sln3075 {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        Arrays.sort(happiness);
        for(int i = 0,j = happiness.length - 1;i<k&&j >=0;i++,j--){
            if(happiness[j] - i >= 0){
                ans += happiness[j] - i;
            }

        }
        return ans;
    }
}

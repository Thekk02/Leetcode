package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 高度互不相同的最大塔高和
 * @date 2024-11-6 10:03:06
 */
public class sln3301 {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);
        int n = maximumHeight.length;
        long ans = maximumHeight[n - 1];
        for(int i = n -2;i >=0;i--){
            maximumHeight[i] = Math.min(maximumHeight[i],maximumHeight[i + 1] - 1);
            if(maximumHeight[i] <= 0){
                return -1;
            }
            ans += maximumHeight[i];
        }
        return ans;
    }
}

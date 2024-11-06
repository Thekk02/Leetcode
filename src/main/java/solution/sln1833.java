package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 雪糕的最大数量
 * @date 2024-11-6 08:23:14
 */
public class sln1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans = 0;
        for(int i = 0;i < costs.length;i++){
            if(costs[i] <= coins){
                coins -= costs[i];
                ans++;
            }else{
                return ans;
            }
        }
        return ans;
    }
}

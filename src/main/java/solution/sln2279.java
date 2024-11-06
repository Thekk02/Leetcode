package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 装满石头的背包的最大数量
 * @date 2024-11-6 08:16:12
 */
public class sln2279 {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int ans = 0;
        int length = capacity.length;
        int[] temp = new int[length];
        for(int i = 0;i < length;i++){
            temp[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(temp);
        for(int i = 0;i < length;i++){
           if(additionalRocks < temp[i]){
               return ans;
           }else{
               additionalRocks -= temp[i];
               ans++;
           }
        }
        return ans;
    }
}

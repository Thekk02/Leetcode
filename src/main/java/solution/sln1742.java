package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 盒子中小球的最大数量
 * @date 2024-10-23 14:19:43
 */
public class sln1742 {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 1;
        for(int i = lowLimit;i <= highLimit;i++){
            int sum = helper(i);
            if(!map.containsKey(sum)){
               map.put(sum,1);
            }else{
                int num = map.get(sum) + 1;
                max = Math.max(max,num);
                map.put(sum,num);
            }
        }
        return max;
    }
    int helper(int x){
        int ans = 0;
        while(x > 0){
            ans += x %10;
            x /= 10;
        }
        return ans;
    }
}

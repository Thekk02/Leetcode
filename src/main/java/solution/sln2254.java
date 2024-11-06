package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 从一个范围内选择最多整数1
 * @date 2024-11-6 09:39:43
 */
public class sln2254 {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for(int num : banned){
            set.add(num);
        }
        int sum = 0;
        int ans = 0;
        for(int i = 1;i <= n;i++){
            if(!set.contains(i)){
                if(sum + i > maxSum){
                    return ans;
                }else{
                    ans++;
                    sum += i;
                }
            }
        }
        return ans;
    }
}

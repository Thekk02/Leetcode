package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 拆分成最多数目的正偶数之和
 * @date 2024-11-6 10:46:03
 */
public class sln2178 {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ans = new ArrayList<>();
        if(finalSum % 2 ==1){
            return ans;
        }
        for(long i = 2;i <= finalSum;i+=2){
            ans.add(i);
            finalSum -= i;
        }
        ans.set(ans.size() - 1,ans.get(ans.size() - 1) + finalSum);
        return ans;
    }
}

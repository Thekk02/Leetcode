package solution;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author kk
 * @description 手机元素的最少操作次数
 * @date 2024-7-10 09:57:01
 */
public class sln2869 {
    public int minOperations(List<Integer> nums, int k) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = nums.size() - 1;i >=0&&set.size() < k;i--){
            int num = nums.get(i);
            if(num <= k){
                set.add(num);
            }
            count++;
        }
        return count;
    }
}

package solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author kk
 * @description 数学小镇中的捣蛋鬼
 * @date 2024-10-16 11:32:46
 */
public class sln3289 {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> s = new HashSet<>();
        List<Integer> list = new ArrayList<Integer>();
        for(int num :nums){
            if (s.contains(num)) {
                list.add(num);
            }else{
                s.add(num);
            }

        }
        int[] ans = new int[2];
        ans[0] = list.get(0);
        ans[1] = list.get(1);
        return ans;
    }
}

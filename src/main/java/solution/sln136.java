package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 只出现一次的数字(异或法)
 * @date 2024-6-18 09:07:09
 */
public class sln136 {
    public int singleNumber(int[] nums) {
        Set set = new HashSet<>();
        for(int num : nums){
            if (!set.contains(num)) {
                set.add(num);
            }else{
                set.remove(num);
            }
        }
        return (int)set.toArray()[0];
    }

    public int singleNumber2(int[] nums){
        int single = 0;
        for(int num : nums){
            single ^= num;
        }
        return single;
    }
}

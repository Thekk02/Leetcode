package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 将数组划分成相等数对
 * @date 2024-10-23 14:46:48
 */
public class sln2206 {
    public boolean divideArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num :nums){
            if(set.contains(num)){
                set.remove(num);
            }
            else{
                set.add(num);
            }
        }
        return set.size() == 0;
    }

}

package solution;

import java.util.*;

/**
 * @author kk
 * @description 多个数组求交集
 * @date 2024-11-1 09:56:14
 */
public class sln2248 {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i + 1 < nums.length;i++){
            for(int num : nums[i]){
                map.put(num,map.getOrDefault(num,0) + 1);
            }
        }
        for(int num : nums[nums.length - 1]){
            if(map.get(num) != null &&(map.get(num) == nums.length - 1)){
                ans.add(num);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}

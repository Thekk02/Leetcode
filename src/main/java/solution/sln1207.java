package solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author kk
 * @description 独一无二的出现次数
 * @date 2024-10-21 09:04:38
 */
public class sln1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set =new HashSet<>();
        for(int i = 0;i < arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                int temp = map.get(arr[i]) + 1;
                map.put(arr[i],temp);
            }
        }
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            if(set.contains(ent.getValue())){
                return false;
            }else{
                set.add(ent.getValue());
            }
        }
        return true;
    }
}

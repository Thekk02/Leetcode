package solution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author kk
 * @description 旅行终点站
 * @date 2024-10-28 10:24:00
 */
public class sln1436 {
    public String destCity(List<List<String>> paths) {
        Map<String,String> map =new HashMap<>();
        for(List<String> path :paths){
            map.put(path.get(0),path.get(1));
        }
        for(Map.Entry<String,String> entry:map.entrySet()){
            if(!map.containsKey(entry.getValue())){
                return entry.getValue();
            };
        }
        return null;
    }
}

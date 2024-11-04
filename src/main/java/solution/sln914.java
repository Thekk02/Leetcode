package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 卡牌分组
 * @date 2024-11-4 09:16:43
 */
public class sln914 {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < deck.length;i++){
            map.put(deck[i],map.getOrDefault(deck[i],0) + 1);
        }
        int ans = map.get(deck[0]);
        if(ans < 2){
            return false;
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() != ans && entry.getValue() % ans != 0){
                return false;
            }
        }
        return true;
    }
}

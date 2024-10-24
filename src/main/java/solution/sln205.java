package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 同构字符串
 * @date 2024-10-24 10:59:40
 */
public class sln205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sm = new HashMap<>();
        Map<Character,Character> tm = new HashMap<>();
        int len = s.length();
        for(int i = 0;i < len;i++){
            char x = s.charAt(i),y = t.charAt(i);
            if((tm.containsKey(y) && tm.get(y) != x) || (sm.containsKey(x) && sm.get(x) != y)){
                return false;
            }
            sm.put(x,y);
            tm.put(y,x);
        }
        return true;
    }
}

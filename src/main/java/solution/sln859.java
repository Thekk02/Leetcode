package solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author kk
 * @description 亲密字符串
 * @date 2024-10-28 09:58:22
 */
public class sln859 {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        Character[] temp = new Character[2];
        int len = s.length();
        for(int i = 0;i < len;i++){
            if(s.charAt(i) != goal.charAt(i)){
                temp[0] = s.charAt(i);
                temp[1] = goal.charAt(i);
                map.put(s.charAt(i),goal.charAt(i));
            }
        }
        if(map.size() != 2){
            return false;
        }else if(map.get(temp[0]) == temp[1] && map.get(temp[1]) == temp[0]){
            return true;
        }
        return false;
    }
}

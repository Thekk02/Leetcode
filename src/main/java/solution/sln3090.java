package solution;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author kk
 * @description 每个字符最多出现两次的最长子字符串
 * @date 2024-11-5 16:10:47
 */
public class sln3090 {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0 ;i < n;i++){
            int temp = 0;
            while(map.getOrDefault(s.charAt(temp),0) < 3){
                map.put(s.charAt(temp),map.getOrDefault(s.charAt(temp),0) + 1);
                temp++;
            }
            ans = Math.max(ans,map.size());
            map.clear();
        }
        return ans;
    }
}

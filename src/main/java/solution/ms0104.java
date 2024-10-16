package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 回文排列
 * @date 2024-10-15 14:51:53
 */
public class ms0104 {
    public boolean canPermutePalindrome(String s) {
        char[] c = s.toCharArray();
        Set<Character> s1 = new HashSet<>();
        Arrays.sort(c);
        for(int i =0 ;i < c.length;i++){
            if(s1.contains(c[i])){
                s1.remove(c[i]);
            }else{
                s1.add(c[i]);
            }
        }
        if(s1.size() == 1 || s1.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}

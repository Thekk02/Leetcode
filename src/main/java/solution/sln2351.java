package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 第一次出现两次的字母
 * @date 2024-11-1 12:54:13
 */
public class sln2351 {
    public char repeatedCharacter(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char ch : chars){
            if(set.contains(ch)){
                return ch;
            }
            else{
                set.add(ch);
            }
        }
        return s.charAt(0);
    }
}

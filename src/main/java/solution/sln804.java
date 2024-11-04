package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 唯一摩尔斯密码词
 * @date 2024-11-4 10:47:32
 */
public class sln804 {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] mima = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] ming = new String[words.length];
        for(int i = 0;i < words.length;i++){
            StringBuilder sb = new StringBuilder();
            for(char ch : words[i].toCharArray()){
                sb.append(mima[ch - 'a']);
            }
            ming[i] = sb.toString();
        }
        for(String str : ming){
            set.add(str);
        }
        return set.size();
    }
}

package solution;

import java.util.*;

/**
 * @author kk
 * @description 查找共用字符
 * @date 2024-10-17 11:42:36
 */
public class sln1002 {
    public List<String> commonChars(String[] words) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq,Integer.MAX_VALUE);
        for(String word: words){
            int[] freq = new int[26];
            int length = word.length();
            for(int i =0;i < length;i++){
                char ch = word.charAt(i);
                ++freq[ch - 'a'];
            }
            for(int i = 0;i < 26;i++){
                minfreq[i] = Math.min(minfreq[i],freq[i]);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minfreq[i]; ++j) {
                list.add(String.valueOf((char) (i + 'a')));
            }
        }
        return list;

    }
}

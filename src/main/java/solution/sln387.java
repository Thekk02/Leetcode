package solution;

/**
 * @author kk
 * @description 字符串中的第一个唯一字符
 * @date 2024-10-23 13:33:35
 */
public class sln387 {
    public int firstUniqChar(String s) {
        int[] cnt = new int[26];
        for(char c:s.toCharArray()){
            cnt[c-'a']++;
        }
        for(int i = 0;i < s.length()-1;i++){
            if(cnt[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}

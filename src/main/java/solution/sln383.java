package solution;

/**
 * @author kk
 * @description 赎金信
 * @date 2024-10-23 13:28:58
 */
public class sln383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int[] cnt = new int[26];
        for(char c :magazine.toCharArray()){
            cnt[c - 'a']++;
        }for(char c :ransomNote.toCharArray()){
            cnt[c - 'a']--;
            if(cnt[c -'a'] < 0){
                return false;
            }
        }
        return true;
    }
}

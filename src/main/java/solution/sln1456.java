package solution;

/**
 * @author kk
 * @description 定长子串中元音的最大数目
 * @date 2024-11-5 12:55:03
 */
public class sln1456 {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int vowel_count = 0;
        for(int i = 0;i < k;i++){
            vowel_count += isVowel(s.charAt(i));
        }
        int ans = vowel_count;
        for(int i = k;i < n;i++){
            vowel_count += isVowel(s.charAt(i)) - isVowel(s.charAt(i -k));
            ans = Math.max(ans,vowel_count);
        }
        return ans;
    }
    public int isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u' ? 1 : 0;
    }
}

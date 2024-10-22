package solution;

/**
 * @author kk
 * @description 最长回文串
 * @date 2024-10-22 12:53:45
 */
public class sln409 {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = s.length();
        for(int i =0 ; i< s.length();i++){
            char c = s.charAt(i);
            count[c]++;
        }
        int ans = 0;
        for(int v : count){
            ans += v/2*2;
            if(v % 2 == 1 && ans % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
}

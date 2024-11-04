package solution;

/**
 * @author kk
 * @description 找出数组中的第一个回文字符串
 * @date 2024-11-1 13:02:41
 */
public class sln2108 {
    public String firstPalindrome(String[] words) {
        for(int i = 0;i < words.length;i++){
            if(isStr(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public boolean isStr(String s){
        int l = 0,r= s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

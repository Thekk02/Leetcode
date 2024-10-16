package solution;

/**
 * @author kk
 * @description 最长回文子串
 * @date 2024-10-16 08:45:12
 */
public class sln5 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2){
            return s;
        }
        int maxLen = 1;
        int begin = 0;
        boolean[][] dp = new boolean[len][len];
        //初始化，所有长度为1的都是回文串
        for(int i = 0;i < len;i++){
            dp[i][i] = true;
        }
        char[] charArray = s.toCharArray();
        //递推开始
        //先枚举字串长度
        for(int L = 2;L <= len;L++){
            //枚举左边界，左边界的上线设置可以宽松一些
            for(int i =0;i<len;i++){
                int j = L + i - 1;
                if(j >=len){
                    break;
                }
                if(charArray[i] != charArray[j]){
                    dp[i][j] =false;
                }else{
                    if(j - i <3){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                //只要dp[i[[L] == true 成立，就表示[i..L]是回文，此时记录回文长度和起始位
                if(dp[i][j] && j - i + 1>maxLen){
                    maxLen = j - i+1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
}

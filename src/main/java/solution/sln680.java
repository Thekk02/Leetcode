package solution;

/**
 * @author kk
 * @description 验证回文串2
 * @date 2024-10-22 13:08:07
 */
public class sln680 {
    public boolean validPalindrome(String s) {
        int low = 0,high = s.length() - 1;
        while(low < high){
            char c1 = s.charAt(low),c2 = s.charAt(high);
            if(c1 == c2){
                low++;
                high--;
            }else{
                return helper(s,low,high - 1) || helper(s,low+1,high);
            }
        }
        return true;
    }
    public boolean helper(String s,int low,int high){
        for(int i = low,j = high;i<=j;i++,j-- ){
            char c1 = s.charAt(i),c2 = s.charAt(j);
            if(c1 != c2){
                return false;
            }
        }
        return true;
    }
}

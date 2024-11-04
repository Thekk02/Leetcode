package solution;

/**
 * @author kk
 * @description 验证回文串
 * @date 2024-10-25 10:37:14
 */
public class LCR018 {
    public boolean isPalindrome(String s) {
        if(s.length() == 0){
            return true;
        }
        int front = 0; int back = s.length() - 1;
        while(front < back){
            if(s.charAt(front) != s.charAt(back)){
                return false;
            }
            front++;
            front--;
        }
        return true;
    }
}

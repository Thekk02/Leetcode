package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 判断是否互为字符重排
 * @date 2024-10-15 14:43:20
 */
public class ms0102 {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}

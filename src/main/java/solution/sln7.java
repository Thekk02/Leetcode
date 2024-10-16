package solution;

/**
 * @author kk
 * @description 整数反转
 * @date 2024-10-16 09:02:19
 */
public class sln7 {
    public int reverse(int x) {
        int ans = 0;
        while(x != 0){
            if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE){
                return 0;
            }
            int digit = x % 10;
            ans = ans * 10 +digit;
            x /= 10;
        }
        return ans;
    }
}

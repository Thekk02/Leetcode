package solution;

/**
 * @author kk
 * @description 阶乘尾数
 * @date 2024-11-4 09:06:26
 */
public class ms1605 {
    public int trailingZeroes(int n) {
        int ans = 0;
        while(n != 0){
            n /= 5;
            ans += n;
        }
        return ans;
    }
}

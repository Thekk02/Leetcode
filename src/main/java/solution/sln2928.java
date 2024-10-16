package solution;

/**
 * @author kk
 * @description 给小朋友分糖果
 * @date 2024-10-15 08:38:20
 */
public class sln2928 {
    public int distributeCandies(int n, int limit) {
        int ans = 0;
        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= limit; j++) {
                if (i + j > n) {
                    break;
                }
                if(n - i - j <= limit){
                    ans++;
                }

            }

        }
        return ans;
    }
}
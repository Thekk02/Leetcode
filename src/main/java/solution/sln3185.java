package solution;

/**
 * @author kk
 * @description 构成整天的下标对数目
 * @date 2024-10-23 08:13:10
 */
public class sln3185 {
    public long countCompleteDayPairs(int[] hours) {
        long ans = 0;
        int[] cnt = new int[24];
        for(int hour : hours){
            ans += cnt[(24 - hour % 24) % 24];
            cnt[hour % 24]++;
        }
        return ans;
    }
}

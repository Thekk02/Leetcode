package solution;

/**
 * @author kk
 * @description 卖卖股票的最佳时机2
 * @date 2024-10-24 08:22:02
 */
public class sln122 {
    public int maxProfit(int[] prices) {
        int lenght = prices.length;
        int ans = 0;
        for(int i = 0;i < lenght -1;i++){
            ans += Math.max(0,prices[i + 1] - prices[i]);
        }
        return ans;
    }
}

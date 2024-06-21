package solution;

/**
 * @author kk
 * @description 买卖股票最佳时机
 * @date 2024-6-18 08:51:47
 */
public class sln121 {
    public int maxProfit(int[] prices){
        int minprice = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0;i < prices.length;i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            else if(prices[i] - minprice > profit){
                profit = prices[i] - minprice;
            }
        }
        return profit;
    }
}

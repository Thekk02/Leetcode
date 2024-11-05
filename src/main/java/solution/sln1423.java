package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 可获得的最大点数
 * @date 2024-11-5 13:45:20
 */
public class sln1423 {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = Arrays.stream(cardPoints).sum();
        int sum = 0;
        for(int i = 0;i < n- k;i++){
            sum += cardPoints[i];
        }
        int ans = sum;
        for(int i = n- k;i < cardPoints.length;i++){
            sum += cardPoints[i] - cardPoints[i+k-n];
            ans = Math.min(sum,ans);
        }
        return total - ans;
    }
}

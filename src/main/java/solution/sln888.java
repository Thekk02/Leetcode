package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 公平的糖果交换
 * @date 2024-10-22 08:35:43
 */
public class sln888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = Arrays.stream(aliceSizes).sum();
        int sum2 = Arrays.stream(bobSizes).sum();
        for(int i = 0;i < aliceSizes.length;i++){
            for(int j = 0; j< bobSizes.length;j++){
                if(sum1 - aliceSizes[i] + bobSizes[j] == sum2 + aliceSizes[i] - bobSizes[j]){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return null;
    }
}

package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 符文储备
 * @date 2024-10-24 15:48:31
 */
public class LCP77 {
    public int runeReserve(int[] runes) {
        Arrays.sort(runes);
        int length = runes.length;
        int ans = 0;
        for(int i = 0;i < length;i++){
            for(int j = i+1;j < length;j++){
                if(runes[j] - runes[j-1] > 1){
                    ans = Math.max(ans,j - i -1);
                    break;
                }
            }
        }
        return ans;
    }
}

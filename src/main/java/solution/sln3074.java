package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 重新分装苹果
 * @date 2024-7-10 10:27:48
 */
public class sln3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        int ans = 0;
        Arrays.sort(capacity);
        for(int i = 0;i < apple.length;i++){
            sum += apple[i];
        }
        for(int i = capacity.length -1 ;i >= 0;i--){
            sum -= capacity[i];
            ans += 1;
            if(sum <= 0){
                return ans;
            }
        }
        return 0;
    }
}

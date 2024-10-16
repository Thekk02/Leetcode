package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 找出缺失和重复的数字
 * @date 2024-10-15 08:17:31
 */
public class sln2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n + 1];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                count[grid[i][j]]++;
            }
        }
        int[] ans = new int[2];
        for(int i = 1;i <= n*n;i++){
            if(count[i] == 2){
                ans[0] = i;
            }else if(count[i] == 0){
                ans[1] = i;
            }
        }
        return ans;
    }
}

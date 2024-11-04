package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 找到冠军1
 * @date 2024-11-1 10:36:46
 */
public class sln2923 {
    public int findChampion(int[][] grid) {
        int n = grid[0].length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    set.add(j);
                }else{
                    set.add(i);
                }
            }
        }
        for(int i = 0;i < n;i++){
            if(!set.contains(i));
            return i;
        }
        return 0;
    }
}

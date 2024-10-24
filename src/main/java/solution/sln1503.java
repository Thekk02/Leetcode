package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 所有蚂蚁掉下来前的最后一刻
 * @date 2024-10-23 10:48:57
 */
public class sln1503 {
    public int getLastMoment(int n, int[] left, int[] right) {
        int max =0;
        for(int num : left){
            max = Math.max(max,num);
        }
        for(int num:right){
            max = Math.max(max,n - num);
        }
        return max;
    }
}

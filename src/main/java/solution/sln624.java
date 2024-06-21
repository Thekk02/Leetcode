package solution;

import java.util.List;

/**
 * @author kk
 * @description 数组列表的最大距离
 * @date 2024-6-19 16:03:56
 */
public class sln624 {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = arrays.size();
        for(int i = 0;i < n;i++) {
            int length = arrays.get(i).size();
            List<Integer> list = arrays.get(i);
            for(int j = 0;j < length;j++){
                min = Math.min(min,list.get(j));
                max = Math.max(max,list.get(j));
            }
        }
        return max - min;
    }
}

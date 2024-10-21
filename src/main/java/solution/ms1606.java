package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 最小差
 * @date 2024-10-21 08:26:17
 */
public class ms1606 {
    public int smallestDifference(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0,j = 0;
        long min = Long.MAX_VALUE;

        while (i < a.length && j <b.length) {
            if (a[i] == b[j]) return 0;
            else if (a[i] > b[j]) {
                min = Math.min(min,(long) a[i] -(long) b[j]);
                j ++;
            } else {
                min = Math.min(min,(long) b[j] -(long) a[i]);
                i ++;
            }
        }
        return (int)min;
    }
}

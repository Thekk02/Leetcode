package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 合并排序的数组
 * @date 2024-11-4 13:15:21
 */
public class ms1001 {
    public void merge(int[] A, int m, int[] B, int n) {
        for(int i = m;i < m+n;i++){
            A[i] = B[i - m];
        }
        Arrays.sort(A);
    }
}

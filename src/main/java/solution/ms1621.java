package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 交换和
 * @date 2024-11-4 14:42:10
 */
public class ms1621 {
    public int[] findSwapValues(int[] array1, int[] array2) {
        int[] ans = new int[2];
        int sum1 = Arrays.stream(array1).sum();
        int sum2 = Arrays.stream(array2).sum();
        for(int i = 0;i < array1.length;i++){
            for(int j = 0;j < array2.length;j++){
                if(array1[i] - array2[j] == sum1 -sum2){
                    ans[0] = array1[i];
                    ans[1] = array2[j];
                    return ans;
                }
            }
        }
        return ans;
    }
}

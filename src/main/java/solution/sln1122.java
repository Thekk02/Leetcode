package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 数组的相对排序
 * @date 2024-11-4 08:30:47
 */
public class sln1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0 ;i < arr1.length;i++){
            map.put(arr2[i],map.getOrDefault(arr2[i],0) + 1);
        }
        return null;
    }
}

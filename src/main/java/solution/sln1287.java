package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 有序数组中出现次数超过25%的元素
 * @date 2024-11-4 11:19:48
 */
public class sln1287 {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int per;
        if(arr.length % 4 == 0){
            per = arr.length /4;
        }else{
            per = arr.length / 4 + 1;
        }

        for(int i =0 ;i < arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                int num = map.get(arr[i]) + 1;
                if(num >= per){
                    return arr[i];
                }else{
                    map.put(arr[i],num);
                }
            }
        }
        return 0;
    }
}

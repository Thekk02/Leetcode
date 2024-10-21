package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 库存管理2
 * @date 2024-10-21 08:36:56
 */
public class LCR158 {
    public int inventoryManagement(int[] stock) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = stock.length;
        for(int i = 0;i < n;i++){
            if(!map.containsKey(stock[i])){
                map.put(stock[i],1);
            }
            else{
                int temp = map.get(stock[i]) + 1;
                if(temp >= n / 2){
                    return stock[i];
                }
                map.put(stock[i],temp);
            }
        }
        return 0;
    }
}

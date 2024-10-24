package solution;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author kk
 * @description 装满被子需要的最短总时长
 * @date 2024-10-24 08:42:15
 */
public class sln2335 {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if(amount[2] >= amount[0] + amount[1]){
            return amount[2];
        }else{
            return amount[2] + (amount[0] + amount[1] - amount[2] + 1) /2 ;
        }
    }
}

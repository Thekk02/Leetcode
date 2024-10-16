package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 分糖果
 * @date 2024-10-15 08:44:13
 */
public class sln575 {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> types = new HashSet<>();
        for(int candy :candyType){
            types.add(candy);
        }
        return Math.min(types.size(),candyType.length / 2);
    }
}

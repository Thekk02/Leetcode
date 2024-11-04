package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 宝石与石头
 * @date 2024-10-28 09:53:42
 */
public class sln771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jew = new HashSet<>();
        int ans = 0;
        for(int i = 0;i < jewels.length();i++){
            jew.add(jewels.charAt(i));
        }
        for(int i = 0;i < stones.length();i++){
            if(jew.contains(stones.charAt(i))){
                ans += 1;
            }
        }
        return ans;
    }
}

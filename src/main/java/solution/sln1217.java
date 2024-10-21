package solution;

/**
 * @author kk
 * @description 玩筹码
 * @date 2024-10-21 09:36:17
 */
public class sln1217 {
    public int minCostToMoveChips(int[] position) {
        int even = 0,odd =0;
        for(int num:position){
            if((num & 1) != 0){
                odd++;
            }else{
                even++;
            }
        }
        return Math.min(odd,even);
    }
}

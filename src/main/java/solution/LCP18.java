package solution;

/**
 * @author kk
 * @description 早餐组合
 * @date 2024-10-23 09:28:19
 */
public class LCP18 {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        int ans = 0;
        for(int i = 0;i < staple.length;i++){
            for(int j  =0;j <drinks.length;j++){
                if(staple[i] +drinks[j] <= x){
                    ans += 1;
                }
            }
        }
        return (int)(x % (1e9 + 7));
    }
}

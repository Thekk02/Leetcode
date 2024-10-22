package solution;

/**
 * @author kk
 * @description 构成整天的小标对数目
 * @date 2024-10-22 10:13:57
 */
public class sln3184 {
    public int countCompleteDayPairs(int[] hours) {
        int ans = 0;
        for(int i = 0; i< hours.length - 1;i++){
            for(int j = i +1;j < hours.length;j++){
                if((hours[i] + hours[j]) % 24 == 0){
                    ans += 1;
                }
            }
        }
        return ans;
    }
}

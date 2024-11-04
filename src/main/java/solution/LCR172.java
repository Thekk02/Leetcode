package solution;

/**
 * @author kk
 * @description 统计目标成绩的出现次数
 * @date 2024-11-4 08:21:35
 */
public class LCR172 {
    public int countTarget(int[] scores, int target) {
        int ans = 0;
        for(int i = 0;i < scores.length;i++){
            if(scores[i] == target){
                ans++;
            }
        }
        return ans;
    }
}

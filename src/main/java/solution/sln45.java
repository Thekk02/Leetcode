package solution;

/**
 * @author kk
 * @description 跳跃游戏
 * @date 2024-10-16 11:44:44
 */
public class sln45 {
    public int jump(int[] nums) {
        int length = nums.length ;
        int end = 0;
        int maxPositon = 0;
        int steps = 0;
        for(int i = 0;i < length -1 ;i++){
            maxPositon = Math.max(maxPositon,i + nums[i]);
            if(i == end){
                end = maxPositon;
                steps++;
            }
        }
        return steps;
    }
}

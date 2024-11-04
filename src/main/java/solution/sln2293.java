package solution;

/**
 * @author kk
 * @description 极大极小游戏
 * @date 2024-11-1 10:08:06
 */
public class sln2293 {
    public int minMaxGame(int[] nums) {
        while(nums.length > 1){
            int[] temp = new int[nums.length /2];
            for(int i = 0;i < temp.length;i++){
                if(i % 2 == 0){
                    temp[i] = Math.min(nums[2 * i],nums[2 * i] +1);
                }else{
                    temp[i] = Math.max(nums[2 * i],nums[2 * i] + 1);
                }
            }
        }
        return nums[0];
    }
}

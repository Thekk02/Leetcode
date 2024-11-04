package solution;

/**
 * @author kk
 * @description 消失的数字
 * @date 2024-11-4 13:17:42
 */
public class ms1704 {
    public int missingNumber(int[] nums) {
        int[] temp = new int[nums.length +1];
        for(int i = 0;i < nums.length;i++){
            temp[nums[i]] = 1;
        }
        for(int i =0 ;i < temp.length;i++){
            if(temp[i] == 0){
                return i;
            }
        }
        return -1;
    }
}

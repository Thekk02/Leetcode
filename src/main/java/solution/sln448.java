package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 找到所有数组中消失的数字
 * @date 2024-10-24 11:17:00
 */
public class sln448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size = nums.length;
        int[] temp = new int[size + 1];
        for(int i = 0;i < size;i++){
            temp[nums[i]]++;
        }
        List<Integer> ans =new ArrayList<>();
        for(int i = 1; i< size +1;i++){
            if(temp[i] == 0){
                ans.add(i);
            }
        }
        return ans;
    }
}

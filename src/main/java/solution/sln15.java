package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kk
 * @description 三数之和
 * @date 2024-6-6 15:22:27
 */
public class sln15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        //枚举a
        for(int first = 0;first < n;first++){
            //需要和上一次枚举的数不同
            if(first > 0 && nums[first] == nums[first - 1]){
                continue;
            }
            int third = n -1;
            int target = -nums[first];
            //枚举b
            for(int second = first + 1;second < n;second++){

            }
        }
        return null;
    }

}

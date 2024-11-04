package solution;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author kk
 * @description 数组嵌套
 * @date 2024-10-29 09:48:24
 */
public class sln565 {
    public int arrayNesting(int[] nums) {
        int ans = 0;
        for(int i = 0;i < nums.length;i++){
            Queue<Integer> queue = new LinkedList<>();
            queue.add(nums[i]);
            while(true){
                if(queue.contains(nums[queue.peek()])){
                    ans = Math.max(ans,queue.size());
                    break;
                }else{
                    queue.add(nums[queue.peek()]);
                }
            }

        }
        return ans;
    }
}

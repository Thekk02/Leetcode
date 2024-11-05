package solution;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author kk
 * @description 每日温度
 * @date 2024-11-5 17:04:08
 */
public class sln739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] ans = new int[length];
        Deque<Integer> stack = new LinkedList<>();
        for(int i = 0;i < length;i++){
            int temperature = temperatures[i];
            while(!stack.isEmpty() && temperature > temperatures[stack.pollLast()]){
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return ans;
    }
}

package solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kk
 * @description 自除数
 * @date 2024-11-4 08:36:40
 */
public class sln728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new LinkedList<>();
        for(int i = left;i <= right +1;i++){
            if(helper(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean helper(int num){
        int temp = num;
        List<Integer> list = new ArrayList<>();
        while(num > 0){
            list.add(num % 10);
            num /= 10;
        }
        for(int n : list){
            if(n == 0 ||temp % n != 0){
                return false;
            }
        }
        return true;
    }
}

package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description FizzBuzz
 * @date 2024-10-28 15:40:23
 */
public class sln412 {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i = 1;i <= n;i++){
            if(i % 3 ==0 && i % 5 == 0){
                ans.add("FizzBuzz");
            }else if(i % 3 == 0){
                ans.add("Fizz");
            }else if(i % 5 ==0){
                ans.add("Buzz");
            }else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}

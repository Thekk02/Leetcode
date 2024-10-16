package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 快乐数
 * @date 2024-10-16 13:11:54
 */
public class sln202 {
    private int getNext(int n){
        int totalsum = 0;
        while(n > 0){
            int d = n % 10;
            n /= 10;
            totalsum += d * d;
        }
        return totalsum;
    }
    public boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while(fastRunner != 1 && slowRunner != fastRunner){
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }
}

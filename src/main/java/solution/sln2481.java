package solution;

/**
 * @author kk
 * @description 分割圆的最少切割次数
 * @date 2024-11-4 16:17:11
 */
public class sln2481 {
    public int numberOfCuts(int n) {
        if(n == 1){
            return 0;
        }
        if(n % 2 == 0){
            return n /2;
        }else{
            return n;
        }
    }
}

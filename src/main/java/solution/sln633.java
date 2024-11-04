package solution;

/**
 * @author kk
 * @description 平方数之和
 * @date 2024-11-4 14:58:40
 */
public class sln633 {
    public boolean judgeSquareSum(int c) {
        for(long a = 0;a * a <= c;a++){
            double b = Math.sqrt(c -a*a);
            if((int)b == b){
                return true;
            }
        }
        return false;
    }
}

package solution;

/**
 * @author kk
 * @description 排列硬币
 * @date 2024-10-22 08:16:02
 */
public class sln441 {
    public int arrangeCoins(int n) {
        int left = 1,right = n;
        while(left < right){
            int mid = (right - left + 1)/2 + left;
            if((long)mid * (mid+1) <= (long)2*n){
                left = mid;
            }else{
                right = mid -1 ;
            }
        }
        return left;
    }
}

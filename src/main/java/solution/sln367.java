package solution;

/**
 * @author kk
 * @description 有效的完全平方数
 * @date 2024-10-22 08:26:25
 */
public class sln367 {
    public boolean isPerfectSquare(int num) {
        int left = 1,right = num;
        while(left <= right){
            int mid = (right - left)/2 + left;
            long square = (long)mid * mid;
            if(square <num){
                left = mid+1;
            }else if(square > num){
                right = mid +1;
            }else{return true;}
        }
        return false;
    }
}

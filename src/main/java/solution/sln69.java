package solution;

/**
 * @author kk
 * @description 69题目
 * @date 2024-6-17 16:57:13
 */
public class sln69 {
    public int mySqrt(int x) {
        int left = 0,right = x,ans = 0;
        while(left <= right){
            int mid = (right - left)/2 + left;
            if(mid * mid <= x){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}

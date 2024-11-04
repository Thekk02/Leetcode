package solution;

/**
 * @author kk
 * @description 统计位数为偶数的数字
 * @date 2024-11-4 11:29:00
 */
public class sln1295 {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int num : nums){
            if(helper(num)){
                ans++;
            }
        }
        return ans;
    }
    public boolean helper(int num){
        int ans = 0;
        while(num > 0){
            ans++;
            num /= 10;
        }
        return ans % 2 == 0;
    }
}

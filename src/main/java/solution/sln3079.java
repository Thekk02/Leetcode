package solution;

/**
 * @author kk
 * @description 求出加密整数的和
 * @date 2024-7-10 10:32:11
 */
public class sln3079 {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i: nums){
            sum += encrypt(i);
        }
        return sum;
    }


    public int encrypt(int n) {
        int temp = n;
        int max = 0;
        while(temp > 0){
            int bit = temp % 10;
            max = Math.max(max,bit);
            temp /= 10;
        }
        int ans = max;
        while(n > 0){
            n /= 10;
            ans = ans * 10 + max;
        }
        return ans;
    }
}

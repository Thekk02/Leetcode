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
        int max = Integer.MIN_VALUE;
        int num = 0;
        for (int i = n; i > 0; i /= 10) {
            max = Math.max(max, i % 10);
        }
        num  = max;
        for(int j = n;j >0;j /=10){
            num = num * 10 + max;
        }
        return num;
    }
}

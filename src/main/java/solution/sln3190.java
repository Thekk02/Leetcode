package solution;

/**
 * @author kk
 * @description 使所有元素都可以被3整除的最少操作数
 * @date 2024-10-16 11:10:51
 */
public class sln3190 {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for(int num :nums){
            ans +=  Math.min(3 - (num %3),num %3);
        }
        return ans;
    }
}

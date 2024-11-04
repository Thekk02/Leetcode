package other;

/**
 * @author kk
 * @description 区域和检索-数组不可变
 * @date 2024-10-25 10:07:58
 */
public class NumArray {
    int[] arr ;
    public NumArray(int[] nums) {
        this.arr = nums;
    }

    public int sumRange(int left, int right) {
        int ans = 0;
       for(int i = left;i <= right;i++) {
           ans += arr[i];
       }
       return ans;
    }
}
